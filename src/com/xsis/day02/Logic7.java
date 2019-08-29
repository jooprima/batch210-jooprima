package com.xsis.day02;

public class Logic7 {
    public static void main(String[] args) {
        int n = 7; //limit
        int r = 2;//ratio
        int a = 2; //nilai awal

        for (int i = 1; i <= n; i++) {
            System.out.print(" " +a);
            a=a*r; //multiplying diff with term
        }
    }
}
