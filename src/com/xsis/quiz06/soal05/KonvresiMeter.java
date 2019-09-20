package com.xsis.quiz06.soal05;

import java.util.Scanner;

public class KonvresiMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose;
        boolean loop = true;

        System.out.print("Enter a distance to meter : ");
        double meter = sc.nextDouble();

        while (loop){
            System.out.println("1.\tConvert to Kilometers");
            System.out.println("2.\tConvert to inches");
            System.out.println("3.\tConvert to feets");
            System.out.println("4.\tQuit");

            System.out.print("\nPilihan anda : ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println(meter + " meters = " + getKilometer(meter) + " kilometer");
                    break;
                case 2:
                    System.out.println(meter + " meters = " + getInches(meter) + " inches");
                    break;
                case 3:
                    System.out.println(meter + " meters = " + getFeets(meter) + " feets");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.err.println("\nInputan anda tidak ada,pilih 1 - 4 ");
            }
        }
    }

    private static double getFeets(double meter) {
        return meter *  3.281;
    }

    private static double getInches(double meter) {
        return meter * 39.37;
    }

    private static double getKilometer(double meter) {
        return meter / 1000;
    }
}
