package com.xsis.quiz.Logic;

public class Soal04 {

    public static void main(String[] args) {

        double[] a = new double[] {2,5,3.5,6.5,10};
        double max = a[0];
        for(int i = 1; i < a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }

        for(int i = 0; i < a.length;i++)
        {
            System.out.print(a[i] + " , ");
        }

        System.out.println("\nThe Largest Number is : " + max);
    }
}
