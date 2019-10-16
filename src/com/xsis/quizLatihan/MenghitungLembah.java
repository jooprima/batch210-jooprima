package com.xsis.quizLatihan;

import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MenghitungLembah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int result = countingValley(n,s);

        System.out.println(result);
        sc.close();
    }

    private static int countingValley(int n, String s) {
        //inisialisasi variabel
        int valley = 0;
        int level = 0;

        //gunakan looping untuk mengecek level permukaan
        for (char current:s.toCharArray()){
            if (current == 'u') //jika u maka level +1
                ++level;
            if (current == 'd') //jika d maka level tambah -1
                --level;

            //fokus pada level permukaan karena setiap lembah
            //pasti diakhiri dengan level air laut dan langkah naik
            if (level == 0 && current == 'u'){
                valley++; //jika benar maka valley tambah
            }
        }
        return valley;
    }
}

//solusi logika
//1. buat variabel valley dan level(permukaan laut)
//2.gunakan looping untuk mengecek permukaan
//3.fokus pada level permukaan karena setiap lembah pasti berlevel pada permukaan air laut
//  dan selalu diakhiri dengan naik
//4. gunakan IF untuk mengecek dua kondisi tersebut
