package com.xsis.day01;

public class Speed {
    public static void main(String[] args) {
        int s = getJarak(2,15);
        System.out.println("jarak = " + s);
    }

    //method function dan return value
    public static int getJarak(int t,int v){
        return v * t;
    }
}
