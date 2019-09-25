package com.xsis.quizLatihan;

import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);

//        java.io.BufferedReader cin = new java.io.
//                BufferedReader(new java.io.InputStreamReader(System.in));
        double amount, discount = 0, payment;
        System.out.print("Enter total amount: ");
        amount = sc.nextDouble();
        if (amount < 30) {
            discount = 0;
        }
        else if (amount >= 30 && amount < 70) {
            discount = 5;
        }
        else if (amount >= 70 && amount < 150) {
            discount = 10;
        }
        else if (amount >= 150) {
            discount = 20;
        }
        payment = amount - amount * discount / 100;
        System.out.println("You got a discount of " + discount + "%");
        System.out.println("You must pay $" + payment);
    }

}
