package com.xsis.day02.logic.Logic01;

public class Logic6 {
    public static void main(String[] args) {
        int n = 7; //limit
        int x = 4; //ratio
        int y = 1; //nilai awal

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0){
                System.out.print(" "+"*");
            }else{
                System.out.print(" "+y);
            }
            y=y+x;
        }
    }
}
