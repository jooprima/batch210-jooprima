package com.xsis.day02;

public class arrayInitializing {
    public static void main(String[] args) {

        //initialiasi arrays
        int[] a = {1,2,3,4,5,6,7,8};
        String[] s = {"hallo","xsis","academy"};
        Double[] d = {1.2,2.00,4.5};
        int[][]matrix = {{1,2,3,4},{4,3,2,1}};

        //initialiasi array with int by each element
        int[] ar = new int[3];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;

        //initialiasi array with string by each element
        String[] ars = new String[3];
        ars[0]="Hello";
        ars[1]="broo";
        ars[2]="jooprima";

        //access array
        System.out.println(a[1]);
        System.out.println(a[5]);
        System.out.println(s[0]);
        System.out.println(d[1]);

        //access multidimesial array
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);

        for (int i = 0; i < s.length; i++) {
            System.out.println("index : "+i+" : "+s[i]);
        }
    }
}
