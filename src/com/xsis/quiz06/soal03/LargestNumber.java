package com.xsis.quiz06.soal03;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int count = 0;
        boolean loop = true;

        while (loop){
            count++;
            System.out.print("Enter a number #"+count+" (-99 to quit) : ");
            int angka = sc.nextInt();
            if (angka == -99) {
                loop = false;
            }

            if (angka != -99){
                if (angka > max){
                    max = angka;
                }else{
                    min = angka;
                }

            }
        }

        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
}
