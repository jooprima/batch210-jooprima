package com.xsis.quiz06.soal06;

import java.util.Scanner;

public class NilaiRatarata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean loop = true;
        double totalScore = 0;
        double average = 0;
        char grade = 0;

        while (loop){
            count++;
            System.out.print("Enter the score for test "+count+" : ");
            double score = sc.nextDouble();

            if (count == 5){
                loop = false;
            }

            totalScore += score;
            average = totalScore / 5;

            if (average >= 9){
                grade = 'A';
            }else if (average >= 8){
                grade = 'B';
            }else if (average >= 7){
                grade = 'C';
            }else if (average >= 6){
                grade = 'D';
            }else {
                grade = 'F';
            }

        }

        System.out.println("\nThe average is : " + average);
        System.out.println("Your letter grade is " + grade);

    }

}
