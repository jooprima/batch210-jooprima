package com.xsis.quiz.Logic;

public class Soal08 {

    double[] harga={1000,1000,3000};
    String[] products={"Kopi","Gula","Teh"};

    public static void main(String[] args) {
        Soal08 bel=new Soal08();
        bel.setProducts();
    }
    double getTotal(double[] harga){
        double total=0;
        for (int i=0;i<harga.length;i++){
            total=total+harga[i];
        }
        return total;
    }
    void setProducts(){
        System.out.println("Product  Harga");
        for (int i=0;i<products.length;i++){
            System.out.println(products[i]+"    "+harga[i]);
        }
        System.out.println("\nTotal  "+getTotal(harga));
    }

}
