package com.xsis.day03;

public class Logic03 {
    public static void main(String[] args) {
        //pola array
        int[][] nums = new int[7][7];

        //call method
        Logic03 arr = new Logic03();
        arr.soal01(nums);
        System.out.println();

        arr.soal02(nums);
        System.out.println();

        arr.deret1(7);
        System.out.println();

        arr.soal011(nums);

//        arr.deret2();
    }

    //membuat method box frame
    void soal01(int[][] nums){
        for (int row = 0; row < nums.length ; row++) {
            for (int column = 0; column < nums.length ; column++) {
                if (row == 0 || row == 6 || column == 0 || column == 6){
                    System.out.printf("%d ",nums[row][column]=9);
                }else{
                    System.out.printf("%s "," ");
                }
            }
            System.out.println();
        }
    }

    void soal02(int[][] nums){
        for (int row = 0; row < nums.length ; row++) {
            for (int column = 0; column < nums.length ; column++) {
                if (row == 6 || row + column == 6|| column == 6){
                    System.out.printf("%d ",nums[row][column]=9);
                }else{
                    System.out.printf("%s "," ");
                }
            }
            System.out.println();
        }
    }

    void soal03(int[][] nums){
        for (int row = 1; row < nums.length ; row++) {
            for (int column = 1; column < nums.length ; column++) {
                if (row == 1){
                    System.out.printf("%d ",nums[row][column]=9);
                }else{
                    System.out.printf("%s "," ");
                }
            }
            System.out.println();
        }
    }

    void soal011(int[][] nums){

        for (int row = 0; row < nums.length ; row++) {
            for (int column = 0; column < nums.length ; column++) {
                if (row == 0 ){
                    for (int i = 0; i <= 0; i++) {
                        int a = 2; //nilai awal
                        int interval = 3; //ratio
                        System.out.print(a + " ");
                        a += 3;
                        interval += 1;
                        if (interval % 3 == 0) {
                            System.out.print("3 ");
                        }
                    }
                }
                if (column == 6){
                    for (int i = 0; i <= 0; i++) {
                        int a = 2; //nilai awal
                        int interval = 3; //ratio
                        System.out.print(a + " ");
                        a += 3;
                        interval += 1;
                        if (interval % 3 == 0) {
                            System.out.print("3 ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public void deret1(int n) {
        int a = 2; //nilai awal
        int x = 3 ;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.print("3"+" ");
            }else{
                System.out.print(a+" ");
            }
            a=a+x;
        }
    }

    public void deret2(){
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

//hasil output
//        9 9 9 9 9 9 9
//        9           9
//        9           9
//        9           9
//        9           9
//        9           9
//        9 9 9 9 9 9 9
//
//        9
//        9 9
//        9   9
//        9     9
//        9       9
//        9         9
//        9 9 9 9 9 9 9
//
//        2 5 8 3 14 17 20


