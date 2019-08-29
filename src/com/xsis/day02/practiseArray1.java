package com.xsis.day02;

public class practiseArray1 {
    public static void main(String[] args) {
        practiseArray1 practise1 = new practiseArray1();
        System.out.println("practise 1");
        practise1.SearchForNumber();
        System.out.println();
        System.out.println("practise 2");
        practise1.SkipBilanganGanjil();
    }


    public void SearchForNumber() {
        int[] nums = {1, 5, 4, 43, -2, 6, 4, 9};
        int search = 4;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                System.out.println("Found " + search + " at position " + i);
                break;
            }
        }
    }

    public void SkipBilanganGanjil() {
        int[] nums = {0, 3, 4, 5, 7, 2, 6, 9, 8, 7, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i] + " is Genap");
                continue;
            }
        }
    }
}

