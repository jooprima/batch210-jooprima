package com.xsis.quiz06.soal07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class KaloriKue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kalori = 300;
        int porsi = 4;
        boolean loop = true;
        String cobaLagi;

        while (loop){
            System.out.print("Kue yang kamu makan : ");
            int kue = sc.nextInt();
            System.out.println("=======================");

            System.out.println("Kamu makan "+getkalori(kue,kalori,porsi)+" kalori");

            System.out.print("\nCoba Lagi ? (y/n) : ");
            cobaLagi = sc.next();
            System.out.println();

            if (cobaLagi.equalsIgnoreCase("n")){
                loop = false;
            }

        }

    }

    private static int getkalori(int kue2,int kaloris,int porsi2) {
        return (kaloris/porsi2)*kue2;
    }
}
