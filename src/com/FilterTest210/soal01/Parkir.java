package com.FilterTest210.soal01;


import java.time.LocalDateTime;

public class Parkir {
    private LocalDateTime tglMasuk;
    private LocalDateTime tglKeluar;

    public LocalDateTime getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(LocalDateTime tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public LocalDateTime getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(LocalDateTime tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    public Parkir(LocalDateTime tglMasuk, LocalDateTime tglKeluar) {
        this.tglMasuk = tglMasuk;
        this.tglKeluar = tglKeluar;
    }
}
