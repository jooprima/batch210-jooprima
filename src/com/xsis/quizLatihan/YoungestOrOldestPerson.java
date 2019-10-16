package com.xsis.quizLatihan;

import java.io.IOException;

public class YoungestOrOldestPerson {
    private static final String IS_NUMERIC = "[+-]?\\d+(\\.\\d+)?";

    public static void main(String[] args) throws IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double x, y;
        String x_str;
        x_str = cin.readLine();
        if (x_str.matches(IS_NUMERIC)) {
            x = Double.parseDouble(x_str);
            if (x >= 10) {
                y = Math.pow(x, 2) / (x + 1) + (3 - Math.sqrt(x)) / (x + 2);
                System.out.println(y);
            }
            else {
                if (x == 9) {
                    System.out.println("Error: Division by zero");
                }
                else {
                    y = 40 * x / (x + 9) + 3 * x;
                    System.out.println(y);
                }
            }
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
