package com.xsis.day05;

public class Logic03 {
    public static void main(String[] args) {
        Logic03 pola = new Logic03();
//        pola.pattern31();
//        pola.soal02();
//        pola.soal022();
        pola.pattern10();
    }

    void pattern31(){
        int n = 5;

        for (int i = n; i >= 1 ; i--) {
            for (int j = n - 1 ; j >= n ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    void soal02(){
        int[][] nums = new int[7][7];
//        int n = 6;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i + j == 6){
                    System.out.printf("%d ",nums[i][j]=1);
                }else{
                    System.out.printf("%s "," ");
                }
            }
            System.out.println();
        }
    }

    void soal022(){
        int deret = 1;
        int deret2 = 7;
        int x = 3; //nilai jeda
        int r1 = 1; //ratio/interval
        int r2 = 3; //ratio /interval
        int a1 = 17; //nilai awal\
        int a2 = 41;
        int a3 = 20;


        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                //garis diagonal
                if (i + j == 8 ){
                    if (r1 <= r2){
                        System.out.print(a1 + " ");
                        a1 -= 3;
                        r1++;
                    }else {
                        System.out.print(x + " ");
                        r1 = 1;
                    }
                }

                // garis bawah
                else if (i == 7){
                    if (j>=1 && j<=2){
                        System.out.print(a2 + " ");
                        a2 -= 3;
                        x *= 3;
                    }else if (j >= 4 && j <= 6){
                        System.out.print(a2 + " ");
                        a2 -= 3;
                    }else{
                        if (j == 8){
                            break;
                        }
                        x *=3;
                        System.out.print(x + " ");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void pattern10(){
        int n = 5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = n - 1; j >= i ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= 1 ; j--) {
                if (i >= j){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
