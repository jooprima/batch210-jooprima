package com.xsis.quiz04.soal03;

import java.util.Scanner;

public class LargestInArray {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int[] angka = new int[10];

        System.out.println(" Please enter Values , press Q to quit : ");

        String check;
        int b = 0;

        do {
            String input = inputUser.next();
            check = input;
            if (!(input.equalsIgnoreCase("q"))){
                angka[b] = Integer.parseInt(input);
            }
            b++;
        }
        while (!(check.equalsIgnoreCase("q")));

        int max = 0;

        //looping untuk mencari angka terbesar
        for (int i=0;i<angka.length;i++) {
            if(angka[i]>max){
                max=angka[i];
            }
        }

        //looping untuk mencetak seluruh angka
        for (int j=0;j<(b-1);j++){
            if (angka[j]==max){
                System.out.println(+angka[j]+"  <=== largest number");
            } else if (angka[j]!=max){
                System.out.println(+angka[j]);
            }
        }

    }

}
