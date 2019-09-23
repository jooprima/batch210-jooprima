package com.xsis.quiz06.soal02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class jumlahHuruf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean loop = true;
        String cobaLagi;

        while (loop){
            System.out.print("Enter a String : ");
            String kalimat = sc.nextLine();

            System.out.print("Enter a character : ");
            String huruf = sc.nextLine();

            System.out.println("\nThe character "+huruf+" appear in "+kalimat+" "+countChar(huruf,kalimat)+" times");


            System.out.print("\nTry again ? (y/n) : ");
            cobaLagi = sc.nextLine();

            if (cobaLagi.equalsIgnoreCase("n")){
                loop = false;
            }
        }



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
