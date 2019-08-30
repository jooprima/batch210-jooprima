package com.xsis.day03;

public class PractiseLogic02 {
    public static void main(String[] args) {
        PractiseLogic02 practice = new PractiseLogic02();
        practice.soal1();
        System.out.println();

        practice.soal5();
        System.out.println();

        practice.soal6();

    }

    public void soal1(){
        int[] nums = {0,1,2,3,4,5,6};
        int n2 = 3;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < nums.length ; i++) {
            System.out.print((int)Math.pow(n2,nums[i]) + " ");
        }
    }

    public void soal5(){
        String statement = "Aku Sayang Kamu";

        System.out.println(statement.replace("y","*"));
    }

    public void soal6(){
        String statement = "AkuSayangKamuTapiKamu";

        System.out.println(statement.indexOf("y"));
    }
}
