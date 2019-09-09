package com.xsis.quiz.Logic;

public class Soal09 {

    public static void main(String[] args) {

        int[] nilai = {10, 9, 7, 10,12};
        Soal09 Score = new Soal09();
        int totalScore = Score.addScores(nilai);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ " , ");
        }
        System.out.print("\ntotal score = " + totalScore);

    }

    public int addScores(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;


    }


}
