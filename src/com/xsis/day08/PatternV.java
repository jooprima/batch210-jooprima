package com.xsis.day08;

public class PatternV {

    public static void main(String[] args) {

        int n = 5; //size
        int px=n; //print left control
        int py=n; //print right control

        for (int i = 1; i <= n ; i++) { //outer loop
            for (int j = 1; j < n*2 ; j++) { //inner loop
                if (j==px || j==py){
                    System.out.print("*"); //print simbol
                }else{
                    System.out.print(" "); //print spasi/whitespace
                }
            } //end of innerloop
            px--;
            py++;
            System.out.println();
        } //end of outer loop

    }

}
