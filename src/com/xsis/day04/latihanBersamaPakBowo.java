package com.xsis.day04;

public class latihanBersamaPakBowo {
    public static void main(String[] args) {
        latihanBersamaPakBowo latihan = new latihanBersamaPakBowo();

        latihan.latihan01();
        System.out.println();

//        latihan.phytagoras(5,7);
//        System.out.println();
//
//        latihan.array2d();
//        System.out.println();


    }

    void latihan01(){
        int deret = 0;
        int deret2 = 1;

        for (int row = 0; row <=5 ; row++) {
            for (int column = 0; column <= 5; column++) {

                if (row == column){
                    deret++;
                    System.out.print(deret + " ");
                }else if (row >= column){
                    System.out.print("* ");
                }else if (row <= column){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    void phytagoras(int n,int m){
        int hasil;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                hasil = i * j;
                System.out.print(hasil);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void array2d(){
        int[][] nums = new int[3][3];
        for (int rows = 0; rows < nums.length; rows++) {
            for (int column = 0; column < nums.length; column++) {
                System.out.print(rows);
                System.out.print(column);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
