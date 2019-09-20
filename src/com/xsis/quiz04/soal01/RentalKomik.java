package com.xsis.quiz04.soal01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RentalKomik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //membuat objek baru di class RentalKomik
        RentalKomik proses = new RentalKomik();

        //membuat objek baru dari class Komik
        Komik sewa = new Komik(proses.tanggalPinjam(sc),proses.tanggalKembali(sc));

        //menampilkan method strukRental
        proses.strukRental(sewa);

    }

    private void strukRental(Komik sewa) {
        System.out.println("\nPenyewaan pada tanggal : "+sewa.getTglPinjam());
        System.out.println("Maksimal pengembalian pada tanggal : "+sewa.getTglPinjam().plusDays(7));
        System.out.println("================================================");
        System.out.println("Tanggal pengembalian \t: "+sewa.getTglKembali());
        System.out.println("Lama sewa \t\t\t\t: "+lamaSewa(sewa));
        System.out.println("Harga sewa \t\t\t\t: " + (int)getTotalSewa(sewa));
        System.out.println("keterlambatan \t\t\t: " + keterlambatan(sewa));
        System.out.println("Harga denda \t\t\t: " + (int)getTotalDenda(sewa));
        System.out.println("------------------------------------------------");
        System.out.println("Total yang harus dibayar \t: " + (int)getTotalBayar(sewa));
    }

    private LocalDate tanggalPinjam(Scanner sc){
        System.out.println("Input tanggal peminjaman ");
        System.out.print("Tahun : ");
        int tahun = sc.nextInt();
        System.out.print("Bulan : ");
        int bulan = sc.nextInt();
        System.out.print("tanggal : ");
        int tanggal = sc.nextInt();

        return LocalDate.of(tahun,bulan,tanggal);
    }

    private LocalDate tanggalKembali(Scanner sc){
        System.out.println("\nInput Tanggal Kembali : ");
        System.out.print("Tahun : ");
        int tahun = sc.nextInt();
        System.out.print("Bulan : ");
        int bulan = sc.nextInt();
        System.out.print("Tanggal : ");
        int tanggal = sc.nextInt();

        return LocalDate.of(tahun,bulan,tanggal);
    }

    private long lamaSewa(Komik dataSewa){
        return ChronoUnit.DAYS.between(dataSewa.getTglPinjam(),dataSewa.getTglKembali());
    }

    private long keterlambatan(Komik dataPinjam){
        long telat = 0;
        LocalDate sewaMaks = dataPinjam.getTglPinjam().plusDays(7);

        if (lamaSewa(dataPinjam) > 7){
            telat = ChronoUnit.DAYS.between(sewaMaks,dataPinjam.getTglKembali());
        }
        if (lamaSewa(dataPinjam) < 7){
            telat = 0;
        }
        return telat;
    }

    private double getTotalDenda(Komik dataDenda){
        double denda = 0;

        if (keterlambatan(dataDenda) == 0){
            denda = 0;
        }else if (keterlambatan(dataDenda) > 0){
            denda = keterlambatan(dataDenda) * 550;
        }
        return denda;
    }

    private double getTotalSewa(Komik dataTotal){
        return lamaSewa(dataTotal) * 2500;
    }

    private double getTotalBayar(Komik dataBayar){
        return getTotalSewa(dataBayar) + getTotalDenda(dataBayar);
    }









}
