package com.xsis.day02;

public class Logic9 {
    public static void main(String[] args) {
        int n = 7;
        int r = 4; //ratio
        int a = 4; //nilai awal

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0){
                System.out.print(" " + "*");
            }else{
                System.out.print(" " + a);
                a=a*r;
            }
        }
    }
}
