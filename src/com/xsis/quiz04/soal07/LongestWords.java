package com.xsis.quiz04.soal07;

import java.time.LocalDate;
import java.util.Scanner;

public class LongestWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kalimar 1 : ");
        String kalimat1 = sc.nextLine();

        System.out.print("kalimat 2 : ");
        String kalimat2 = sc.nextLine();

        LongestWords lg = new LongestWords();

        lg.getLongest(kalimat1,kalimat2);


    }

    private void getLongest(String kata1,String kata2){
        int length1 = kata1.length();
        int length2 = kata2.length();

        if (length1 > length2){
            System.out.println(kata1 + " is longest");
        }else if (length1 < length2){
            System.out.println(kata2 + " is longest");
        }else {
            System.out.println(kata1 +" & "+kata2 + " is the same length");
        }
    }

}
