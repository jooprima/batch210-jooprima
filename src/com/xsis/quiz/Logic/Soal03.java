package com.xsis.quiz.Logic;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan Score : ");
        int inputScore = inputUser.nextInt();

        getGrade(inputScore);

    }

    private static void getGrade(int score){

        if (score >= 90 && score <=100){
            System.out.println("Grade : A");
        }
        else if (score >= 80 && score <= 89){
            System.out.println("Grade : B");
        }
        else if (score >= 70 && score <= 79){
            System.out.println("Grade : C");
        }
        else if (score >= 60 && score <= 69){
            System.out.println("Grade : D");
        }
        else if (score <= 59){
            System.out.println("Grade : E");
        }else {
            System.out.println("nilai tidak ditemukan");
        }
    }
}
