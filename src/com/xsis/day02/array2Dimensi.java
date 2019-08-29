package com.xsis.day02;

public class array2Dimensi {
    public static void main(String[] args) {
        int[][] nums = {{1, 5, 4, 3},
                        {9, 3, 5, 6},
                        {4, 5, 6, 12}};
        array2Dimensi array2d = new array2Dimensi();
        array2d.searchNums(nums,6);
    }

    public void searchNums(int[][] nums, int search) {
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                if (nums[row][column] == search)
                    System.out.println("Search : " + search + ", at position " + "Baris : " + row + " ,Kolom : " + column);
            }
        }
    }
}

//output :
//        Search : 6, at position Baris : 1 ,Kolom : 3
//        Search : 6, at position Baris : 2 ,Kolom : 2
