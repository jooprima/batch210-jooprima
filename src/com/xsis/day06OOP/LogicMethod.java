package com.xsis.day06OOP;

public class LogicMethod {

    int n,x,y;

    void soal1(){
        System.out.println("===== SOAL 01 =====");
        n = 7;
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + (2 * i - 1));
        }
        System.out.println();
    }

    void soal2(){
        System.out.println("===== SOAL 02 =====");
        n = 7;
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + (2 * i));
        }
        System.out.println();
    }

    void soal3(){
        System.out.println("===== SOAL 03 =====");
        n = 7;
        x = 3;
        y = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(" "+y);
            y=y+x;
        }
        System.out.println();
    }

    void soal5(){
        System.out.println("===== SOAL 05 =====");
        n = 7;
        x = 4;
        y = 1;

        for (int i = 1; i <=n ; i++) {


            if (i % 3 == 0){
                System.out.print(" "+"*");
            }else {
                System.out.print(" "+y);
                y=y+x;
            }

        }
        System.out.println();
    }


}
