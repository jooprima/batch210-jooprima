package com.xsis.quiz06.soal02;

import java.util.Scanner;

public class jumlahHuruf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String kalimat = sc.nextLine();

        System.out.print("Enter a character : ");
        String huruf = sc.nextLine();

        System.out.println("\nThe character "+huruf+" appear in "+kalimat+" "+countChar(huruf,kalimat)+" times");

    }

    private static int countChar(String hurufs, String kalimats) {
        int found = 0;

        for (int i = 0; i < kalimats.length(); i++) {
            //string check
            if (hurufs.equalsIgnoreCase(String.valueOf(kalimats.charAt(i)))){
                found++;
            }
        }
        return found;
    }


}
