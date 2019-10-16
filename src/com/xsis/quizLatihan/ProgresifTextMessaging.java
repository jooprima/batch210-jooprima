package com.xsis.quizLatihan;

import java.util.Scanner;

public class ProgresifTextMessaging {
    /*Perusahaan Telepon Seluler LAV membebankan pelanggan tarif dasar sebesar $ 8 per bulan untuk dikirim
    pesan teks. Tarif tambahan dibebankan berdasarkan jumlah total pesan teks
    dikirim, seperti yang ditunjukkan pada tabel berikut.

    Number of Text              Additional Rates
    Messages Sent               (in USD per text message)
    ----------------------------------------------------
      Up to 50                    Free of charge
      51 – 150                      $0.05
      151 and above                 $0.10

    Pajak federal, negara bagian, dan lokal menambahkan total 10% untuk setiap tagihan.
    Tulis program Java yang meminta pengguna untuk memasukkan jumlah pesan teks yang dikirim
    dan kemudian menghitung dan menampilkan jumlah total yang harus dibayar.
    Harap dicatat bahwa tarifnya progresif.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        double extra,total_without_tax,tax,total;

        System.out.print("Enter number of text message sent : ");
        count = sc.nextInt();

        if (count <= 50){
            extra = 0;
        } else if (count <= 150){
            extra = (count - 50) * 0.05;
        }else {
            extra = 100 * 0.05 + (count - 150) * 0.10;
        }

        total_without_tax = 8 + extra;
        tax = total_without_tax * 10 /100;
        total = total_without_tax + tax;

        System.out.println("Total amount to pay : " + total);
    }
}
