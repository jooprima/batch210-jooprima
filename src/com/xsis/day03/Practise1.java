package com.xsis.day03;

public class Practise1 {
    public static void main(String[] args) {
        //pola array
        int[][] nums = new int[5][5];

        //call method setbox
        Practise1 arr = new Practise1();
        arr.setBox(nums);
        System.out.println();
        arr.setLoop();
        System.out.println();
        arr.setDiagonalBoxLeft(nums);
        System.out.println();
        arr.setDiagonalBoxRight(nums);
        System.out.println();
        arr.setCrossBox(nums);
    }

//    membuat method perulangan setbox
    void setBox(int[][] nums){
        for (int row = 0; row < nums.length; row++) {
            for (int columns = 0; columns < nums[row].length; columns++) {
                System.out.printf("%d ",nums[row][columns]=9);
            }
            System.out.println();
        }
    }

    void setLoop(){
        for (int i = 0; i < 7; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 7; i >= 0 ; i--) {
            System.out.print(i+" ");
        }
    }

    void setDiagonalBoxLeft(int[][] nums){
        for (int row = 0; row < nums.length; row++) {
            for (int columns = 0; columns < nums[row].length; columns++) {
                if (row==columns){
                    System.out.printf("%d ",nums[row][columns]=9);
                }else {
                    System.out.printf("%s ","*");
                }
            }
            System.out.println();
        }
    }

    void setDiagonalBoxRight(int[][] nums){
        for (int row = 0; row < nums.length; row++) {
            for (int columns = 0; columns < nums[row].length; columns++) {
                if (row + columns == 4){
                    System.out.printf("%d ",nums[row][columns]=9);
                }else {
                    System.out.printf("%s ","*");
                }
            }
            System.out.println();
        }
    }

    void setCrossBox(int[][] nums){
        for (int row = 0; row < nums.length; row++) {
            for (int columns = 0; columns < nums[row].length; columns++) {
                if (row + columns == 4){
                    System.out.printf("%d ",nums[row][columns]=5);
                }else if(row==columns){
                    System.out.printf("%d ",nums[row][columns]=5);
                }else{
                    System.out.printf("%s ","*");
                }
            }
            System.out.println();
        }
    }
}

//hasil output
//  9 * * * *
//  * 9 * * *
//  * * 9 * *
//  * * * 9 *
//  * * * * 9
//
//  * * * * 9
//  * * * 9 *
//  * * 9 * *
//  * 9 * * *
//  9 * * * *
//
//  5 * * * 5
//  * 5 * 5 *
//  * * 5 * *
//  * 5 * 5 *
//  5 * * * 5