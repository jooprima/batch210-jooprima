package com.xsis.quiz06.soal08;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listMonth = {
                "january","february","march","april",
                "may","june","july","august","September",
                "october","november","December"
        };

        boolean loop = true;

        while (loop){
            System.out.print("Enter a month(1-12) : ");
            int month = sc.nextInt();
            int months = month - 1;

            System.out.print("Enter a year : ");
            int year = sc.nextInt();

            System.out.println("\n"+listMonth[months]+" "+year+" has "+getDay(month,year)+" days ");

            System.out.print("\nTry again ? (y/n) : ");
            String cobaLagi = sc.next();
            System.out.println();

            if (cobaLagi.equalsIgnoreCase("n")){
                loop = false;
            }

        }


    }

    private static int getDay(int month2, int year2) {
        int day = 0;

        if (month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7
        || month2 == 8 || month2 == 10 || month2 == 12){
            day = 31;
        }else if (month2 == 2){
            if (year2 % 4 == 0){
                day = 29;
            }else {
                day =28;
            }
        }else {
            day = 30;
        }
        return day;
    }
}
