package com.xsis.day10;

import java.util.Scanner;

public class SortingIncrease {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Masukan element array : ");

        for (int i = 0; i < 5 ; i++) {
            arr[i] = inputUser.nextInt();
        }

        System.out.println("Array yang belum di sorting : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ,");
        }

        //sorting procedure
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] > arr[j]){ //untuk merubah menjadi decrease tinggal ubah menjadi "<"
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("\n\nArray yang sudah disorting : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ,");
        }

    }

}
