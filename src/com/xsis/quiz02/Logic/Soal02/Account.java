package com.xsis.quiz02.Logic.Soal02;

public class Account {
    private int noRek;
    private double saldo;

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Account(int noRek, double saldo) {
        this.noRek = noRek;
        this.saldo = saldo;
    }
}
