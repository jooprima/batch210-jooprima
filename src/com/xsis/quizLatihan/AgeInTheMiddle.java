package com.xsis.quizLatihan;

import java.io.IOException;

public class AgeInTheMiddle {
    public static void main(String[] args) throws IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double x, y;
        x = Double.parseDouble(cin.readLine());
        if (x == 5 || x == 1) {
            System.out.println("Error: Division by zero");
        }
        else {
            y = (5 * x + 3) / (x - 5) + (3 * Math.pow(x, 2) + 2 * x + 2) / (x + 1);
            System.out.println(y);
        }
    }
}
