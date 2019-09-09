package com.xsis.quiz.Logic;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        int arr[] = new int[5];
        int max;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("please enter the value : ");

        for (int i = 0; i < 5; i++) {
            arr[i] = inputUser.nextInt();
        }

        max = arr[0]; //inisialisasi

        for (int i = 0; i < 5; i++) {
            if (max < arr[i]){ // jika largest number found
                max = arr[i]; //mengupdate value of max
            }
        }

        System.out.println("The largest value = " + max);

    }

}
