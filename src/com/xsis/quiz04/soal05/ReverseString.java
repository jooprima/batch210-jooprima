package com.xsis.quiz04.soal05;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kalimat : ");
        String kalimat = sc.nextLine();

//        String str = "Selamat Belajar Pemrograman Java";

        System.out.println("Sebelum di balik : " + kalimat);
        int length = kalimat.length();

        String akhir = "";
        for(int i = length -1; i >= 0; i-- ){
            akhir = akhir + kalimat.charAt(i);
        }

        System.out.println("\nSetelah di reverse : " + akhir);
    }
}
