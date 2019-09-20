package com.xsis.quiz03.Logic;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class cashRegister {

    public static void main(String[] args) {

        //membuat objek class baru
        Barang brg1 = new Barang("06-478","Shirt-Sport",'M',100,350000,LocalDate.of(2019,8,17));
        Barang brg2 = new Barang("06-420","Shirt-sport-Abu",'M',120,350000,LocalDate.of(2019,8,17));
        Barang brg3 = new Barang("01-100","Baju Anak sport",'M',150,150000,LocalDate.of(2019,3,15));
        Barang brg4 = new Barang("02-200","Baju Wanita",'M',150,250000,LocalDate.of(2019,9,15));

        //membuat objek class menjadi array
        Barang[] listBarang = {brg1,brg2,brg3,brg4};

        //membuat objek baru dari class cashRegister
        cashRegister struk1 = new cashRegister();

        //membuat objek baru menjadi array
        cashRegister[] listBelanja = new cashRegister[10];
        Barang[] listBelanjaBarang = new Barang[10];
        double[] listHarga = new double[10];
        int[] listQty = new int[10];

        Scanner inputUser = new Scanner(System.in);

        String lanjut;
        String member;
        int totalBarang = 0;

        System.out.println("Apakah anda member ? ");
        System.out.print("Tekan (y) jika member, jika bukan tekan (n) : " );
        member = inputUser.nextLine();

        do {
            System.out.println("Silahkan masukan kode barang : ");
            String kodeBarang = inputUser.nextLine();

            Barang barang = struk1.findBarang(kodeBarang,listBarang);

            struk1.showBarang(barang);

            int lama = struk1.getLamaBarang(barang);
            double setDisc = struk1.prosesDiskon(lama,member);
            barang.setDiscount(struk1.prosesDiskon(lama,member));

            System.out.print("Silahkan masukan jumlah barang : ");
            int jumlah = inputUser.nextInt();

            double harga = struk1.getHargaBarang(barang,jumlah);
            double diskon = struk1.getBesarDiskon(harga,barang.getDiscount());
            double total = struk1.getTotalBelanja(harga,diskon);

            int sisaBarang = (barang.getQuantity() - jumlah);

            if (barang.getItemCode().equalsIgnoreCase(kodeBarang)){
                barang.setQuantity(sisaBarang);
            }

            System.out.println("Total : " + total);

            listBelanjaBarang[totalBarang] = barang;
            listHarga[totalBarang] = harga;
            listQty[totalBarang] = jumlah;

            totalBarang++;

            System.out.print("Apaakah ada barang lagi yang ingin dibeli : tekan(y/t) ");
            lanjut = inputUser.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));
        System.out.println("\nItem \t jumlah \t Harga/pcs \t Total \t Diskon");
        for (int i = 0; i < totalBarang; i++) {
            System.out.println(listBelanjaBarang[i].getItemName()+"\t"+
                    listQty[i]+"\t"+listBelanjaBarang[i].getHarga()+"\t"+
                    listHarga[i]+"\t"+(listBelanjaBarang[i].getDiscount() * listHarga[i]));
        }

        double totalHargaAll = struk1.getTotalHarga(listBelanjaBarang,listQty,totalBarang);
        double totalDiskonAll = struk1.getTotalDiskon(listBelanjaBarang,listHarga,totalBarang);
        double totalPotonganDiskon = struk1.getTotalPotongan(totalHargaAll,totalDiskonAll);

        System.out.println("\nTotal \t\t\t\t: " + totalHargaAll + "\t\t" + totalDiskonAll);
        System.out.println("Potong Diskon \t\t: "+totalPotonganDiskon);
        System.out.println("PPN 5% \t\t\t\t: " + ((5/100) * totalPotonganDiskon));
        System.out.println("jumlah yang harus dibayar \t: " + (totalPotonganDiskon+((5/100) * totalPotonganDiskon)));

        System.out.print("Masukan uang anda \t\t: ");
        double uang = inputUser.nextDouble();
        System.out.println("Tunai \t\t: " + uang);
        System.out.println("Kembalian \t\t: " + (uang - (totalPotonganDiskon + (0.05 * totalPotonganDiskon))));

        struk1.showStoBarang(listBarang);

    }


    private Barang findBarang(String kodeBarang,Barang[] listBarang){
        Barang beli = null;
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i].getItemCode().equalsIgnoreCase(kodeBarang)){
                beli = listBarang[i];
            }
        }
        return beli;
    }

    private int getLamaBarang(Barang item){
        Period diff = Period.between(item.getTglMasuk(),LocalDate.now());
        int lama = diff.getDays();

        return lama;
    }

    private double prosesDiskon(int lama, String member){
        double diskon = 0;
        if (lama >= 30){
            diskon = (double) 40/100;
        }
        if (lama >= 60 && member.equalsIgnoreCase("n")){
            diskon = (double)60/100;
        }
        if (lama <= 30 && member.equalsIgnoreCase("y")){
            diskon = (double)10/100;
        }
        if ((lama >= 30 && lama <= 60) && member.equalsIgnoreCase("y")){
            diskon = (double)50/100;
        }
        if (lama >= 60 && member.equalsIgnoreCase("y")){
            diskon = (double)70/100;
        }
        return diskon;
    }

    private void showStoBarang(Barang[] barang){
        System.out.println("Kode Barang \t\t Nama Item \t\t Quantity");
        for (int i = 0; i < barang.length; i++) {
            System.out.println(barang[i].getItemCode()+"\t\t"+barang[i].getItemName()+"\t\t"+barang[i].getQuantity());
        }
    }

    private double getTotalHarga(Barang[] barang,int[] listQty,int totalBarang){
        double total = 0;

        for (int i = 0; i < totalBarang; i++) {
            total = (barang[i].getHarga() * listQty[i]) + total ;
        }
        return total;
    }

    private double getTotalDiskon(Barang[] barang,double[] listHarga,int totalBarang){
        double totalDiskon = 0;
        for (int i = 0; i < totalBarang; i++) {
            totalDiskon = totalDiskon + (barang[i].getDiscount() * listHarga[i]);
        }
        return totalDiskon;
    }

    private double getTotalPotongan(double totalHarga,double totalDiskon){
        return totalHarga - totalDiskon;
    }

    private double getHargaBarang(Barang item,int jumlah){
        return item.getHarga() * jumlah;
    }

    private double getBesarDiskon(double hargaBarang, double diskon){
        return hargaBarang - diskon;
    }

    private double getTotalBelanja(double hargaBarang, double diskon){
        return hargaBarang-diskon;
    }

    private void showBarang(Barang barang){
        System.out.println("Kode Barang \t: " + barang.getItemCode());
        System.out.println("Nama Barang \t: " + barang.getItemName());
        System.out.println("Ukuran \t\t\t: " + barang.getSize());
        System.out.println("Harga Barang \t: " + barang.getHarga());
        System.out.println("Stok Barang \t: " + barang.getQuantity());
    }



}
