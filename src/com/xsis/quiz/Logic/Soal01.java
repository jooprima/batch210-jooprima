package com.xsis.quiz.Logic;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        //membuat program cash register

        //membuat variable
        int hargaProduk = 20000;
        int kembalian,cash;

        //membuat objek yg diambil dari input user
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan Uang cash : ");

        //memasukan nilai inputan kedalam variable cash
        cash = inputUser.nextInt();
        System.out.println("Uang cash anda adalah : " + cash);
        System.out.println("Harga produk adalah : " + hargaProduk);

        //operasi cash register
        kembalian = cash - hargaProduk;

        System.out.println("Uang kembalian anda adalah : " + kembalian);

    }

}
