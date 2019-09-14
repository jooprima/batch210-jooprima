package com.xsis.quiz01;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        double bunga,tenor,plafon,bAdmin,premi,angsuranBulanan,premiBulan;
        int harga;

        Scanner inputUser = new Scanner(System.in);

        //input harga mobil
        System.out.print("Input Harga mobil : ");
        harga = inputUser.nextInt();

        //input bunga
        System.out.print("Input bunga : ");
        bunga = inputUser.nextInt();

        //input tenor
        System.out.print("Input tenor : ");
        tenor = inputUser.nextInt();

        //input premi
        System.out.print("Input premi : ");
        premi = inputUser.nextDouble();

        //input biaya admin
        System.out.print("Input biaya admin : ");
        bAdmin = inputUser.nextDouble();

        //prosessss
        //buat objek instance baru soal
        Soal02 soal = new Soal02();

        //return plafon
        plafon = soal.getPlafon(harga);

        //return premi bulanan
        premiBulan = soal.getPremiBulan(premi,harga);

        //call method total bunga
        soal.getTotalBunga(harga,bunga,tenor);

        //return angsuran bulanan
        angsuranBulanan = soal.getAngBul(plafon,bunga,tenor);
        System.out.println("\ntotal angsuran bulanan : " + (int)angsuranBulanan+"\n");

        //call method angsuran bulan pertama
        soal.getAngBulPer(plafon,angsuranBulanan,premiBulan,bAdmin);
    }


    private double getPlafon(int harga){
        double dp = 20;
        return ((dp/100)*harga);
    }

    private double getAngBul(double plafon, double totalBunga, double tenor){
        return (plafon + totalBunga) / (tenor*12);
    }

    private double getPremiBulan(double premi,int harga){
        return ((premi/100)/12)*harga;
    }

    private void getTotalBunga(double plafon,double bunga,double tenor){
        double totalBunga;

        totalBunga = plafon * ((bunga * tenor) / 100);
        System.out.println("\ntotal bunga yang dibayar : " + (int)totalBunga);
    }

    private void getAngBulPer(double plafon,double angsuranBulanan,double premiBulan,double bAdmin){

        double abp;

        abp = (plafon + angsuranBulanan + premiBulan + bAdmin);

        System.out.println("Total Angsuran bulan pertama : " + (int)abp);
    }

}
