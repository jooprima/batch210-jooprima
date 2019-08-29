package com.xsis.day02;

public class Logic6 {
    public static void main(String[] args) {
        int n = 7;
        int x = 4;
        int y = 1;

        for (int i = 1; i <= n; i++) {


            if (i == 3){
                System.out.print(" "+"*");
            }else if (i == 6){
                System.out.print(" "+"*");
            }else{
                System.out.print(" "+y);
            }
            y=y+x;
        }
    }
}
