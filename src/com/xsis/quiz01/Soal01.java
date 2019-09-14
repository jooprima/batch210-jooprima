package com.xsis.quiz01;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        int totalUang, jangkaWaktu;
        double bunga, bunga2;

        //input total uang
        System.out.print("Total Uang : ");
        totalUang = inputUser.nextInt();

        //input bunga
        System.out.print("Bunga pertahun : ");
        bunga = inputUser.nextInt();

        //input jangka waktu
        System.out.print("Jangka waktu : ");
        jangkaWaktu = inputUser.nextInt();

        //buat objek baru
        Soal01 soal01 = new Soal01();
        bunga2 = soal01.getBunga(bunga);

        //call method
        soal01.getTotalDeposit(totalUang,jangkaWaktu,bunga2);
    }


    //return getBunga
    private double getBunga(double bunga) {
        return bunga / 100;
    }

    //method total deposit
    private void getTotalDeposit(int totalUang,int jangkaWaktu,double bunga2) {
        double totalDeposit = totalUang;
        for (int i = 0; i < jangkaWaktu; i++) {
            int bpt = (int) (bunga2 * totalUang);
            totalDeposit += bpt;
        }
        System.out.println("\nTotal deposit anda selama " +jangkaWaktu+" tahun = " + (int)totalDeposit);
    }

}