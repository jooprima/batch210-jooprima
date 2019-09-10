package com.xsis.day10;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n; //limit
        int cn; //current number /nomer saat ini
        int fact; // factorial

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        n = inputUser.nextInt();

        System.out.println("\nFaktorial number antara 1 to "+n+" : ");

        System.out.println("Number  :  Faktorial");

        //proses faktorial
        for (int i = 1; i <= n; i++) {
            cn=i;
            fact=1;
            for (int j = 1; j <= cn; j++) {
                fact = fact * j;
            }
            System.out.printf("%5d : %d\n",cn,fact); //%5d untuk formating o/p
        } //end of outer loop
    } //end of main

} //end of class
