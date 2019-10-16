//package com.FilterTest210.soal01;
//
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;
//import java.util.Date;
//import java.util.Locale;
//
//public class TarifParkir {
//    private static TarifParkir SelisihDateTime;
//
//    public static void main(String[] args) {
//        Parkir park1 = new Parkir("27-Januari-2019 05:00:01","27-Januari-2019 17:45:03");
//        Parkir park2 = new Parkir("27-Januari-2019 07:03:59","27-Januari-2019 15:30:06");
//        Parkir park3 = new Parkir("27-Januari-2019 07-05-00","28-Januari-2019 00:20:21");
//        Parkir park4 = new Parkir("27-Januari-2019 11:14:23","27-Januari-2019 13:20:00");
//
//        Locale lokal = null;
//        String pola = "dd-MMMM-yyyy HH:mm:ss:SSS";
//        String waktuSatuStr = "20-Mei-2014 15:06:56:568";
//        String waktuDuaStr = "18-Januari-2001 17:43:23:344";
//        Date waktuSatu = SelisihDateTime.konversiStringkeDate(park1.getTglMasuk(),pola, lokal);
//        Date WaktuDua = SelisihDateTime.konversiStringkeDate(park2, pola,lokal);
//        Date WaktuTiga = SelisihDateTime.konversiStringkeDate(park3, pola,lokal);
//        Date WaktuEmpat = SelisihDateTime.konversiStringkeDate(park4, pola,lokal);
//        String hasilSelisih = SelisihDateTime.selisihDateTime(waktuSatu,WaktuDua);
//        System.out.println("Selisih tanggal \""+waktuSatuStr+"\" dengan tanggal \""+waktuDuaStr+"\" adalah: ");
//        System.out.println(hasilSelisih);
//    }
//
//    private static String selisihDateTime(Date waktuSatu, Date waktuDua) {
//        long selisihMS = Math.abs(waktuSatu.getTime() - waktuDua.getTime());
//        long selisihDetik = selisihMS / 1000 % 60;
//        long selisihMenit = selisihMS / (60 * 1000) % 60;
//        long selisihJam = selisihMS / (60 * 60 * 1000) % 24;
//        long selisihHari = selisihMS / (24 * 60 * 60 * 1000);
//        return selisihHari + " hari " + selisihJam + " Jam "
//                + selisihMenit + " Menit " + selisihDetik + " Detik";
//    }
//
//    private static Date konversiStringkeDate(String tanggalDanWaktuStr,String pola, Locale lokal) {
//        Date tanggalDate = null;
//        SimpleDateFormat formatter;
//        if (lokal == null) {
//            formatter = new SimpleDateFormat(pola);
//        } else {
//            formatter = new SimpleDateFormat(pola, lokal);
//        }
//        try {
//            tanggalDate = formatter.parse(tanggalDanWaktuStr);
//        } catch (ParseException ex) {
//            ex.printStackTrace();
//        }
//        return tanggalDate;
//    }
//
//    private double lamaParkir(Parkir dataParkir){
//        return ChronoUnit.DAYS.between(dataParkir.getTglMasuk(),dataParkir.getTglKeluar());
//    }
//
//
//}
