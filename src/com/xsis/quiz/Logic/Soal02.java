package com.xsis.quiz.Logic;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        //mencetak bilangan prima sesuai input n/jumlah deret,
        //mengecek setiap angka untuk bilangan prima
        //jika angak tsb bilangan prima maka di print

        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah deret bilangan : ");
        int n = input.nextInt();

        System.out.println(n + " bilangan prima pertama adalah: ");

        int hitung = 0; //menghitung jumlah bilangan prima
        int angka = 2; //angka untuk menguji blangan prima

        //Perulangan dilakukan untuk mencari bilangan prima
        while(hitung < n){

            //set boolean prima ke true
            boolean prima = true;

            for(int i = 2; i <= angka / 2; i++){

                if (angka % i == 0){
                    prima = false;//set prima ke false
                    break;//keluar dari loop
                }

            }

            if(prima){

                hitung++;

                if(hitung % n == 0){
                    System.out.println(angka);

                }
                else{
                    System.out.print(angka + " , ");
                }
            }
            //Cek bila angka adalah bilangan prima
            angka++;
        }
    }
}


