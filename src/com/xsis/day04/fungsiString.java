package com.xsis.day04;

public class fungsiString {
    public static void main(String[] args){
        //Mendekarasikan Variable sebelum Nilainnya Diganti
        String kalimat1 = "XXXXXX TECHNO ART";
        String kalimat2 = "Belajar Java Beruqma";
        String kalimat3 = "Cyanjur";

        //Mengubah Kalimat Satu karakter
        String KalimatBaru3 = kalimat3.replace("y", "i");

        //Mengubah Kalimat Lebih dari Satu karakter
        String KalimatBaru2 = kalimat2.replace("uq", "sa");

        //Mengubah Kalimat Lebih dari Satu karakter
        String KalimatBaru1 = kalimat1.replace("XXXXXX", "WILDAN");

        //Menampilkan Hasil Sebelum Dan Seesudah Diganti
        System.out.println("===== Contoh Mengubah Satu Karakter");

        System.out.println("Sebelum Diubah: "+kalimat1);
        System.out.println("Sesudah Diubah: "+KalimatBaru1);

        System.out.println("===== Contoh Mengubah Lebih Dari Satu Karakter");

        System.out.println("Sebelum Diubah: "+kalimat2);
        System.out.println("Sesudah Diubah: "+KalimatBaru2);

        System.out.println("Sebelum Diubah: "+kalimat3);
        System.out.println("Sesudah Diubah: "+KalimatBaru3);
    }
}
