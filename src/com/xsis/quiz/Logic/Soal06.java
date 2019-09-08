package com.xsis.quiz.Logic;

public class Soal06 {

    public static void main(String[] args) {

        Soal06 ch = new Soal06();
        ch.countChar("xsis java programmer developer winner",'e');
    }
    void countChar(String kalimat,char huruf){
        int hitung=0;
        for (int i=0;i<kalimat.length();i++){
            if (kalimat.charAt(i) == huruf){
                hitung++;
            }
        }
        System.out.print("Jumlah karakter "+huruf+" dalam "+kalimat+" adalah "+hitung);

    }

}
