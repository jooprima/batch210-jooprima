package com.xsis.quizLatihan;

import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah uang : ");
        double uang = sc.nextDouble();

        System.out.print("Masukan bunga per tahun : ");
        double bunga = sc.nextDouble();

        System.out.print("Masukan jangka waktu : ");
        int jangkaWaktu = sc.nextInt();

        getTotalDeposit(uang,jangkaWaktu,getBunga(bunga));
    }

    private static void getTotalDeposit(double uang2, int jangkaWaktu2, double bunga3) {
        double totalDeposit = uang2;
        for (int i = 0; i < jangkaWaktu2; i++) {
            double depositPerTahun = bunga3 * uang2;
            totalDeposit = totalDeposit + depositPerTahun;
        }
        System.out.println("Jumlah total uang selama "+jangkaWaktu2+" tahun adalah : Rp. "+(int)totalDeposit);
    }

    private static double getBunga(double bunga2) {
        return bunga2 / 100;
    }

}
