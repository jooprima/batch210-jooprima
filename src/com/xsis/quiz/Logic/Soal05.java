package com.xsis.quiz.Logic;

public class Soal05 {

    public static void main(String[] args){
        new Soal05().palindrome("1456541");
    }

    private void palindrome(String teks){
        String kalimat = "";
        int max = teks.length();
        for(int i=0;i<teks.length();i++){
            String test1 = teks.substring(max-1, max);
            max--;
            kalimat += test1;
        }

        if(teks.equals(kalimat)){
            System.out.println(teks+" = Palindrome");
        }else{
            System.out.println(teks+" = Bukan Palindrome");
        }
    }
}
