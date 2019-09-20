package com.xsis.quiz04.soal08;

import java.util.Scanner;

public class JumlahKata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Kalimat : ");
        String kalimat = sc.nextLine();

        JumlahKata jumlah = new JumlahKata();

        jumlah.getJumlahKata(kalimat);


    }

    private void getJumlahKata(String kalimat1){
        int panjang = kalimat1.length();
        int jumlahKata = 1;

        for (int i = 0; i < panjang; i++) {
            char k = kalimat1.charAt(i);

            if (k == ' ' || k == '.' ){
                jumlahKata++;

            }

        }
        System.out.println("jumlah kata dalam 1 kalimat : " + jumlahKata);


    }

}
