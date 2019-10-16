package com.xsis.quizLatihan;

import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month,year;

        System.out.print("Enter month(1-12) : ");
        month = sc.nextInt();
        System.out.print("Enter year : ");
        year = sc.nextInt();

        if (month == 2){
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println("This month has 29 days");
            }else {
                System.out.println("this month has 28 days");
            }
        }else if (month==4 || month==6 || month==9 || month==11){
            System.out.println("this month has 30 days");
        }else {
            System.out.println("this month has 31 days");
        }
    }
}
