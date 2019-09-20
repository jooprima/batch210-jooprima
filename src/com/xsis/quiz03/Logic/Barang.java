package com.xsis.quiz03.Logic;

import java.time.LocalDate;
import java.util.Date;

public class Barang {
    private String itemCode;
    private String itemName;
    private char size;
    private int quantity;
    private double harga;
    private LocalDate tglMasuk;
    private double discount;

    public Barang(String itemCode, String itemName, char size, int quantity, double harga, LocalDate tglMasuk) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.size = size;
        this.quantity = quantity;
        this.harga = harga;
        this.tglMasuk = tglMasuk;
//        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public LocalDate getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(LocalDate tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
