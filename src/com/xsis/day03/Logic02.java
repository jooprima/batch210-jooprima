package com.xsis.day03;

public class Logic02 {
    public static void main(String[] args) {
        Logic02 practice = new Logic02();

//        System.out.println("-----------SOAL01-----------");
//        practice.soal1();
//        System.out.println();
//        System.out.println();
//
//        System.out.println("-----------SOAL02-----------");
//        practice.soal2();
//        System.out.println();
//        System.out.println();

        System.out.println("-----------SOAL03-----------");
        practice.soal3();
        System.out.println();
        System.out.println();

//        System.out.println("-----------SOAL04-----------");
//        practice.soal4();
//        System.out.println();
//        System.out.println();
//
        System.out.println("-----------SOAL05-----------");
        practice.soal5();
        System.out.println();

        System.out.println("-----------SOAL06-----------");
        practice.soal6();
        System.out.println();

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

    public void soal2(){
        int[] nums = {0,1,2,3,4,5,6};
//        int n2 = 3;
//        int n3 = -1;
//        int a = 1;
        int r = 2; //ratio / interval
        double hasil;
        int jumlah1;
        int jumlah;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length ; i++) {
            if (i == r){
                hasil = Math.pow(3,i);
                jumlah1 = (int) -hasil;
                r += 3;

                System.out.print(jumlah1);
                System.out.print(" ");

            }else {
                hasil = Math.pow(3,i);
                jumlah = (int) hasil;
                System.out.print(jumlah);
                System.out.print(" ");
            }

        }
    }

    public void soal3(){
        int hasil = 2;

        for (int i = 0; i <=7 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 1){
                hasil *= 3;
            }else if (i >= 1 && i <= 3){
                hasil *= 2;
            }else if(i >= 4 && i <= 5){
                hasil /= 2;
            }else if(i == 6){
                hasil /= 3;
            }

            System.out.print(hasil + " ");


        }

    }

    public void soal4(){
        int nums[] = new int[7];
        int ganjil = 5;
        int genap = 1;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 ){
                System.out.print(genap + " ");
                genap += 1;
            }else{
                System.out.print(ganjil + " ");
                ganjil += 5;
            }
        }
    }

    public void soal5(){
        String kalimat1 = "Aku Sayang Kamu";

        String kalimatBaru1 = kalimat1.replace("k","*").replace("ayan","***").replace("am","**");
        System.out.println(kalimatBaru1);
    }

    public void soal6(){
        String kalimat1 = "AkuSayangKamuTapiKamu";

//        System.out.println(statement.indexOf("y"));

        String[] kalimatBaru = kalimat1.split("(\\G)");
        for (String r:kalimatBaru)
        {
            System.out.println(r);
        }

    }
}
