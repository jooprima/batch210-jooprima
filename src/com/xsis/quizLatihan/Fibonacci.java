package com.xsis.quizLatihan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0,n2 = 1,count = 0, result, input;

        System.out.print("Enter any number : ");
        input = sc.nextInt();

        while (true){
            result = n1 + n2;
            count++;

            if (result >= input){
                break;
            }
            n1 = n2;
            n2 = result;
            System.out.println("Fibonacci No - "+count+" = "+result);
        }


    }
}
