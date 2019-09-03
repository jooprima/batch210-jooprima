package com.xsis.day05;

public class Logic3Soal2 {
    public static void main(String[] args) {
        int num[][] = new int[7][7];
        int i,j;
        int intervalAwal=1;
        int intervalAkhir=3;
        int n1=17;
        int n2=41;
        int n3=20;
        int x=3;

        for (i=6; i>=0; i--){
            for (j=0; j<=num[i].length; j++){

                // Atas
                if (i==j){
                    if (intervalAwal <= intervalAkhir) {
                        System.out.print(n1);
                        System.out.print(" ");

                        n1 -= 3;
                        intervalAwal ++;
                    }
                    else {
                        System.out.print(x);
                        System.out.print(" ");

                        intervalAwal=1;
                    }
                }

                // Bawah
                else if (i==0){
                    if (j>=1 && j<=2){
                        System.out.print(n2);
                        System.out.print(" ");
                        n2 -= 3;
                        x*=3;
                    }

                    else if (j>=4 && j<=6) {
                        System.out.print(n2);
                        System.out.print(" ");
                        n2 -= 3;
                    }

                    else {
                        if (j==num.length){
                            break;
                        }

                        x*=3;
                        System.out.print(x);
                        System.out.print(" ");
                    }
                }

                // Kanan
                else if (j==6) {
                    if (i==5) {
                        System.out.print(x*3);
                        System.out.print(" ");
                    }

                    else if (i>=2 && i<=4){
                        System.out.print(n3);
                        System.out.print(" ");
                        n3 += 3;
                    }

                    else if (i==1) {
                        System.out.print(x*3*3);
                        System.out.print(" ");
                    }
                }

                else {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
