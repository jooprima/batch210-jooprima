package com.xsis.day10;

public class PatternV {

    public static void main(String[] args) {

        PatternV pt = new PatternV();
        pt.PolaV(5);
        System.out.println("\n");
        pt.PolaVangka(5);
        System.out.println("\n");
        pt.PolaVhuruf(5);
        System.out.println("\n");
        pt.PolaVkebalik(5);

    }

    public void PolaV(int n){
//        int n = 5; //size
        int px=n; //print left control
        int py=n; //print right control

        for (int i = 1; i <= n ; i++) { //outer loop
            for (int j = 1; j < n*2 ; j++) { //inner loop
                if (j==px || j==py){
                    System.out.print("*"); //print simbol
//                    System.out.printf("%c",px+64);
                }else{
                    System.out.print(" "); //print spasi/whitespace
                }
            } //end of innerloop
            px--;
            py++;
            System.out.println();
        } //end of outer loop
    }

    public void PolaVangka(int n){
//        int n = 5; //size
        int px=n; //print left control
        int py=n; //print right control

        for (int i = 1; i <= n ; i++) { //outer loop
            for (int j = 1; j < n*2 ; j++) { //inner loop
                if (j==px || j==py){
                    System.out.print(i); //print simbol
//                    System.out.printf("%c",px+64);
                }else{
                    System.out.print(" "); //print spasi/whitespace
                }
            } //end of innerloop
            px--;
            py++;
            System.out.println();
        } //end of outer loop
    }

    public void PolaVhuruf(int n){
//        int n = 5; //size
        int px=n; //print left control
        int py=n; //print right control

        for (int i = 0; i < n ; i++) { //outer loop
            for (int j = 1; j < n*2 ; j++) { //inner loop
                if (j==px || j==py){
//                    System.out.print(i); //print simbol
                    System.out.printf("%c",i+65);
                }else{
                    System.out.print(" "); //print spasi/whitespace
                }
            } //end of innerloop
            px--;
            py++;
            System.out.println();
        } //end of outer loop
    }

    public void PolaVkebalik(int n){
        //pattern V kebalik
//        int n = 5; //size
        int px=1; //print left control
        int py=n*2-1; //print right control

        for (int i = 1; i <= n ; i++) { //outer loop
            for (int j = 1; j < n*2 ; j++) { //inner loop
                if (j==px || j==py){
                    System.out.print("*"); //print simbol
                }else{
                    System.out.print(" "); //print spasi/whitespace
                }
            } //end of innerloop
            px++;
            py--;
            System.out.println();
        } //end of outer loop
    }

}
