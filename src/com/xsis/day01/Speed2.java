package com.xsis.day01;

public class Speed2 {
    public static void main(String[] args) {
        Speed2 speed = new Speed2();
        int s = speed.getSpeed(3,5);
        System.out.println("jarak = " + s);
    }

    public  int getSpeed(int t,int v){
        return t * v;
    }
}
