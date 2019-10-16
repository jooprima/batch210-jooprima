package com.xsis.quizLatihan;

public class NilaiMaxMin {
    public static void main(String[] args) {
        Integer array[] = {55,89,45,74,341,56,78,32,34,33,92};
        Integer indexTerbesar = array[0];
        Integer indexTerkecil = array[0];
        for(int i=0;i<array.length;i++){
            if(indexTerbesar < array[i]){
                indexTerbesar = array[i];
            }
            if(indexTerkecil > array[i]){
                indexTerkecil = array[i];
            }
        }
        System. out.println(indexTerbesar+" :nilai terbesar ");
        System. out.println(indexTerkecil+" :nilai terkecil ");
    }
}
