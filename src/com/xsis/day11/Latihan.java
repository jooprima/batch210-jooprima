package com.xsis.day11;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan harga ");
        double harga=scan.nextDouble();
        System.out.println("Masukan lama/tenor dalam tahun");
        int tenor=scan.nextInt();
        System.out.println("Masukan bunga kredit ");
        double bungat=scan.nextDouble();
        System.out.println("Masukan bunga persenDP ");
        int persendp=scan.nextInt();
        System.out.println("Masukan besar premi dalam persen ");
        double premi=scan.nextDouble();
        System.out.println("Masukan biaya administrasi ");
        double admin=scan.nextDouble();
        /*System.out.println("Masukan bunga persenDP ");
        int persendp=scan.nextInt();*/
        Latihan order1 =new Latihan();
        double getdp= order1.getDP(persendp,harga);
        double getplafon=order1.getPlafon(getdp,harga);
        double bungayangharusdibayar = order1.getBungaYangHarusDibayar(getplafon,bungat,tenor);
        double angsuranbulanan = order1.getAngsuranBulanan(getplafon,bungayangharusdibayar,tenor);
        double getpremi = order1.getPremi(premi,harga);
        double cicilanbulanpertama = order1.getAngsuranBulananPertama(getdp,angsuranbulanan,harga,getpremi,admin);
        System.out.println("Besar DP "+(int)getdp);
        System.out.println("Besar Plafon "+(int)getplafon);
        System.out.println("Besar bunga  "+(int)bungayangharusdibayar);
        System.out.println("Besar angsuran bulanan  "+(int)angsuranbulanan);
        System.out.println("cicilan bulan pertama  "+(int)cicilanbulanpertama);
        //   order1.getbayarbunga(harga,tenor);
    }
    public double getDP(double persenDP,double harga){
        return (persenDP/100)*harga;
    }
    public double getPlafon(double dp,double harga){
        return harga-dp;
    }
    public double getBungaYangHarusDibayar(double getplafon,double bunga,int tenor){
        System.out.println(bunga);
        return getplafon*((bunga*tenor)/100);
    }
    public double getAngsuranBulanan(double getplafon,double bungayangharusdibayar,int tenor){
        return (getplafon+bungayangharusdibayar)/(tenor*12);
    }
    public double getPremi(double persenpremi,double harga){
        return (persenpremi/100)*harga;
    }
    public double getAngsuranBulananPertama(double dp,double getangsuranbulanan, double harga,double getPremi,double admin){
        return dp+getangsuranbulanan+(getPremi/12)+admin;
    }
}
