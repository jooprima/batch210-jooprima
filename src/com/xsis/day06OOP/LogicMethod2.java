package com.xsis.day06OOP;

public class LogicMethod2 {

    int n,x,y,r,a;

    void soal6(){
        System.out.println("===== SOAL 06 =====");
        n = 7; //limit
        x = 4; //ratio
        y = 1; //nilai awal

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0){
                System.out.print(" "+"*");
            }else{
                System.out.print(" "+y);
            }
            y=y+x;
        }
        System.out.println();
    }

    void soal7(){
        System.out.println("===== SOAL 07 =====");
        n = 7; //limit
        r = 2;//ratio
        a = 2; //nilai awal

        for (int i = 1; i <= n; i++) {
            System.out.print(" " +a);
            a=a*r; //multiplying diff with term
        }
        System.out.println();
    }

    void soal8(){
        System.out.println("===== SOAL 08 =====");
        n = 7; //limit
        r = 3; //ratio
        a = 3; //nilai awal

        for (int i = 0; i < n ; i++) {
            System.out.print(" "+a);
            a=a*r; //multiplying diff with term
        }
        System.out.println();
    }

    void soal9(){
        System.out.println("===== SOAL 09 =====");
        n = 7;
        r = 4; //ratio
        a = 4; //nilai awal

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0){
                System.out.print(" " + "*");
            }else{
                System.out.print(" " + a);
                a=a*r;
            }
        }
        System.out.println();
    }

    void soal10(){
        System.out.println("===== SOAL 10 =====");
        n = 7; //limit
        r = 3; //ratio
        a = 3; //nilai awal

        for (int i = 1; i <= n; i++) {
            if (i == 4){
                System.out.print(" "+"xxx");
            }else{
                System.out.print(" "+a);
            }
            a=a*r;
        }
        System.out.println();
    }

}
