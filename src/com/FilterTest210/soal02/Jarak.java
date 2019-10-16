package com.FilterTest210.soal02;

import java.util.Scanner;

public class Jarak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String inputString;
        System.out.println("input deret jarak dalam meter: ");
        inputString = sc.nextLine();

        int[]arrInt = stringToInt(inputString);
        double sum = 0;
        int bensin = 2500;
        for (int i = 0; i <= arrInt.length ; i++) {
            sum += arrInt[i];
        }
        System.out.println("total "+(sum/bensin)*2+" Liter");
    }

    private static int[] stringToInt(String inputString){
        String[] arrString = inputString.split(" ");
        int[] intArray = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            intArray[i] = Integer.parseInt(arrString[i]);
        }
        return intArray;
    }
}


