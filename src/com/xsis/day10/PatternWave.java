package com.xsis.day10;

public class PatternWave {

    public static void main(String[] args) {

        int tinggiWave = 3; //ubah value untuk merubah tinggi wave
        int lebarWave = 1; //ubah value untuk merubah lebar value
        int tw = tinggiWave - 1; //untuk kondisi loop
        int x = tw; // if kondisi untuk print

        for (int i = 0; i <= tw ; i++) { //outer loop

            for (int j = 0; j <= tw * lebarWave * 2; j++) { //inner loop
                if (j % (tw * 2) == x || j % (tw * 2) == tw + i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } //end of inner loop
            x--;
            System.out.println();

        } //end of outer loop

    }

}
