//package com.xsis.quiz04.soal09;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class JumlahHurufVocal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Masukan kata : ");
//        String kata = sc.nextLine();
//
//
//    }
//
//    private static getJumlahVokal(String kata1){
//        char[] vokal = {'a','i','u','e','o'};
//        int panjang = kata1.length();
//        Map jumlahVokal = new HashMap<>();
//
//        for (int i = 0; i < panjang; i++) {
//            char k = kata1.charAt(i);
//
//            //looping mencari vokal
//            for (int j = 0; j < vokal.length; j++) {
//                if (k == vokal[j]){
//                    if (jumlahVokal.containsKey(k)){
//                        int jumVok = jumlahVokal.get(k);
//                        jumVok++;
//                        jumlahVokal.put(k,jumVok);
//                    } else {
//                        jumlahVokal.put(k,1);
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}
