package com.xsis.quizLatihan;

import java.util.Scanner;

public class AgeMiddle {
    /*Tulis program Java yang meminta pengguna memasukkan hari (1 - 31),
    sebulan (1 - 12), dan setahun kemudian menemukan dan menampilkan
    berapa hari lagi akhir bulan itu. Program harus mempertimbangkan lompatan
    tahun. Dalam kasus tahun kabisat, Februari memiliki 29 bukannya 28 hari.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1,age2,age3,max,middle,min;

        System.out.print("Enter the for person no1 : ");
        age1 = sc.nextInt();
        System.out.print("Enter the for person no2 : ");
        age2 = sc.nextInt();
        System.out.print("Enter the for person no3 : ");
        age3 = sc.nextInt();

        min = age1;
        if (age2 < min){
            min = age2;
        }
        if (age3 < min){
            min = age3;
        }
        max = age1;
        if (age2 > max){
            max = age2;
        }
        if (age3 > max){
            max = age3;
        }

        middle = age1 + age2 + age3 - min - max;
        System.out.println(middle);
    }
}
