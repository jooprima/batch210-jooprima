package com.xsis.day01;

public class Gaya {
    //create method fungsi
    public int getGaya(int m,int a){
        return m * a;
    }

    //create method fungsi
    public int getMassa(int f,int a){
        return f / a;
    }

    //create method fungsi
    public int getPercepatan(int f, int m){
        return f/ m;
    }

    public static void main(String[] args) {
        //call non static method gaya()
        Gaya gaya = new Gaya();
        int x = gaya.getGaya(12,5);
        System.out.println("Resultan Gaya = " + x);

        //call non static method massa()
        Gaya massa = new Gaya();
        int y = massa.getMassa(30,5);
        System.out.println("Massa = " + y);

        //call non static method percepatan()
        Gaya percepatan = new Gaya();
        int z = percepatan.getPercepatan(14,7);
        System.out.println("Percepatan = " + z);
    }
}
