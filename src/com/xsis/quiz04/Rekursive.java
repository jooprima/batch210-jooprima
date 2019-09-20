package com.xsis.quiz04;

import java.util.Scanner;

public class Rekursive {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int nilai = inputUser.nextInt();
        System.out.println("anda memasukan nilai : " + nilai);

        //call method
        printNilai(nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("faktorial = " + faktorial);

    }

    //fungsi recursive sederhana

    private static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;

        printNilai(parameter);
    }

    private static int jumlahNilai(int parameter){
        System.out.println("Parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter){
        System.out.println("parameter : " + parameter);

        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }

}
