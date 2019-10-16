package com.xsis.quizLatihan;

import java.io.IOException;
import java.util.Scanner;

public class KonversiSuhu {
    private static final String IS_NUMERIC = "[+-]?\\d+(\\.\\d+)?";

    public static void main(String[] args) throws IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int choice;
        double t;
        String t_str;
        System.out.println("1. Convert Kelvin to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Kelvin");
        System.out.println("3. Convert Fahrenheit to Celsius");
        System.out.println("4. Convert Celsius to Fahrenheit");
        System.out.print("Enter a choice: ");
        choice = Integer.parseInt(cin.readLine());
        System.out.print("Enter a temperature: ");
        t_str = cin.readLine();
        if (choice < 1 || choice > 4) {
            System.out.println("Wrong choice");
        }
        else if (!t_str.matches(IS_NUMERIC)) {
            System.out.println("Wrong temperature");
        }
        else {
            t = Double.parseDouble(t_str);
            switch (choice) {
                case 1:
                    System.out.println(1.8 * t - 459.67);
                    break;
                case 2:
                    System.out.println((t + 459.57) / 1.8);
                    break;
                case 3:
                    System.out.println(5 / 9 * (t - 32));
                    break;
                case 4:
                    System.out.println(9 / 5 * t + 32);
                    break;
            }
        }
    }
}
