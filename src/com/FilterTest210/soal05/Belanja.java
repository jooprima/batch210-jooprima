//package com.FilterTest210.soal05;
//
//import java.util.Scanner;
//
//public class Belanja {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inputKacamata;
//        String inputBaju;
//
//        System.out.print("Uang Andi : ");
//        int uang = sc.nextInt();
//
//        System.out.print("Harga Kacamata : ");
//        sc.nextLine();
//        inputKacamata = sc.nextLine();
//
//
//        System.out.print("Harga Baju : ");
//        sc.nextLine();
//        inputBaju = sc.nextLine();
//
//        int[]arrInt1 = stringToInt(inputKacamata);
//        int[]arrInt2 = stringToInt(inputBaju);
//
////        getTotalKacamata(arrInt1);
//        System.out.println(getMax(arrInt1,arrInt2,uang));
//
//        int sum1 = arrInt1[1]+arrInt2[1];
//        int sum2 = arrInt1[1]+arrInt2[2];
//        int sum3 = arrInt1[1]+arrInt2[3];
//        int sum4 = arrInt1[2]+arrInt2[1];
//        int sum5 = arrInt1[2]+arrInt2[2];
//        int sum6 = arrInt1[2]+arrInt2[3];
//        int sum7 = arrInt1[3]+arrInt2[1];
//        int sum8 = arrInt1[3]+arrInt2[2];
//        int sum9 = arrInt1[3]+arrInt2[3];
//
//        if (sum1 < uang){
//            System.out.println();
//        }
//
//        for (int i = 0; i < arrInt1.length; i++) {
//            if ()
//        }
//
//    }
//
//    private static int getMax(int[] arrInt1, int[] arrInt2,int uang){
//        int max = 0;
//        for (int i = 0; i < arrInt1.length; i++) {
//            if (arrInt1[i] + arrInt2[i] > max){
//                max =
//            }
//        }
//        return max;
//
//
//    }
//
////    private static int getTotalBaju(int[] arrInt2){
////        for (int i = 0; i < ; i++) {
////
////        }
////    }
//
//    private static int[] stringToInt(String inputString){
//        String[] arrString = inputString.split(" ");
//        int[] intArray = new int[arrString.length];
//        for (int i = 0; i < arrString.length; i++) {
//            intArray[i] = Integer.parseInt(arrString[i]);
//        }
//        return intArray;
//    }
//}
