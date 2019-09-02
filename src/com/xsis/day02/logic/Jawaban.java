package com.xsis.day02.logic;

public class Jawaban {
    public static void main(String[] args) {
        Jawaban lg = new Jawaban();
         lg.testSoal1(14);
        System.out.println();
         lg.testSoal2(14);
        System.out.println();
        lg.testSoal3(7);
        System.out.println();
        lg.testSoal5(7);
        System.out.println();
        lg.testSoal6(7);
        System.out.println();
        lg.testSoal7(7);
    }

    public void testSoal1(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void testSoal2(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void testSoal3(int n) {
        int deret = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret + " ");
            deret = deret + 3;
        }
    }

    public void testSoal5(int n) {
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret + " ");
            deret = deret + 4;
            interval += 1;
            if (interval % 2 == 0) {
                System.out.print("* ");
            }
        }
    }

    public void testSoal6(int n) {
        int min = 4;
        int max = 8;
        int interval = 2;
        int deret = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(deret + " ");
            interval += 1;
            if (interval % 2 == 0) {
                System.out.print("* ");
                deret = deret + max;
            } else {
                deret = deret + min;
            }
        }
    }

    public void testSoal7(int n) {
        int j = 2;
        for (int i = 0; i <= n; i++) {
            System.out.print(j + " ");
            j = j * 2;
        }
    }

}



