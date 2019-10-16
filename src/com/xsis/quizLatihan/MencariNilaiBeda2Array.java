package com.xsis.quizLatihan;

public class MencariNilaiBeda2Array {
    public static void main(String[] args) {
        int [] data1 = {3,5,8,11,14,16,17,19,20};
        int [] data2 = {1,3,5,11,13,17,18,20};
        int [] data3 = {};
        System.out.print ("Data 1 = ");
        for (int k = 0; k<data1.length; k++){
            System.out.print (data1[k] + " ");
        }

        System.out.print ("\nData 2 = ");
        for (int l = 0; l<data2.length; l++){
            System.out.print (data2[l] + " ");
        }
        System.out.print ("\n--------------------------------\nData yang sama = ");
        for (int i = 0; i<data1.length; i++){
            for (int j = 0; j<data2.length; j++){
                if (data1[i] == data2[j])
                    System.out.print (data3[i] + " ");
            }
        }
    }
}
