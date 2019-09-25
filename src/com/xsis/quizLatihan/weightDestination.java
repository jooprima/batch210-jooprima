package com.xsis.quizLatihan;

import java.util.Scanner;

public class weightDestination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = 0,cost;
        String dest;

        System.out.print("Enter weight and destionation : ");
        dest = sc.nextLine();

        if (dest.equalsIgnoreCase("i")){
            if (weight <= 1){
                cost = weight * 0.010;
            }else if (weight <= 2){
                cost = weight * 0.013;
            }else if (weight <= 4){
                cost = weight * 0.015;
            }else {
                cost = weight * 0.020;
            }
        }else {
            if (weight <= 1){
                cost = 10;
            }else if (weight <= 2){
                cost = 20;
            }else if (weight <= 4){
                cost = 50;
            }else {
                cost = 60;
            }
        }
        System.out.println("Shipping Cost : " +  cost);
    }
}
