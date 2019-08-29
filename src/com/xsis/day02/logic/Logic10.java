package com.xsis.day02.logic;

public class Logic10 {
    public static void main(String[] args) {
        int n = 7; //limit
        int r = 3; //ratio
        int a = 3; //nilai awal

        for (int i = 1; i <= n; i++) {
            if (i == 4){
                System.out.print(" "+"xxx");
            }else{
                System.out.print(" "+a);
            }
            a=a*r;
        }
    }
}
