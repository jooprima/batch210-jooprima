package com.xsis.day02.logic;

public class Logic8 {
    public static void main(String[] args) {
        int n = 7; //limit
        int r = 3; //ratio
        int a = 3; //nilai awal

        for (int i = 0; i < n ; i++) {
            System.out.print(" "+a);
            a=a*r; //multiplying diff with term
        }
    }
}
