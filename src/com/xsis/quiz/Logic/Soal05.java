package com.xsis.quiz.Logic;

public class Soal05 {

    public static void main(String[] args){
        new Soal05().palindrome("8009");
    }

    private void palindrome(String teks){
        String kalimat = "";
        int maxT = teks.length();
        for(int i=0;i<teks.length();i++){
            String test1 = teks.substring(maxT-1, maxT);
            maxT--;
            kalimat += test1;
        }

        if(teks.equals(kalimat)){
            System.out.println(teks+" = Palindrome");
        }else{
            System.out.println(teks+" = Bukan Palindrome");
        }
    }
}
