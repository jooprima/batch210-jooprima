package com.xsis.quiz06.soal01;

import java.util.Scanner;

public class GajiPerBulan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly budget : Rp. ");
        int budget = sc.nextInt();
        System.out.println("Money spent this month (type -1 to quit) : ");
        System.out.println("--------------------------------------------");

        int count = 0;
        int close = -1;
        boolean kondisi = true;
        int totalCost = 0;
        int sisaBudget = 0;

        while (kondisi){
            count++;

            System.out.print("Enter cost #"+count+" : ");
            int cost = sc.nextInt();
            if (cost == close){
                kondisi =  false;
            }


            if (cost != close){
                totalCost += cost;
            }

            if (cost != close){
                sisaBudget = budget - totalCost;
            }

        }
        System.out.println("\nTotal Cost : " + totalCost);
        System.out.println("You are " +sisaBudget+" under your budget");
    }
}

