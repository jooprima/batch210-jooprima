package com.xsis.quiz04.soal01;

import java.time.LocalDate;

public class Komik {
    private LocalDate tglPinjam;
    private LocalDate tglKembali;

    public Komik(LocalDate tglPinjam, LocalDate tglKembali) {
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public LocalDate getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(LocalDate tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public LocalDate getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(LocalDate tglKembali) {
        this.tglKembali = tglKembali;
    }
}
