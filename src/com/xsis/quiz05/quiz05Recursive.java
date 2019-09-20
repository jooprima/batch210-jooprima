package com.xsis.quiz05;

public class quiz05Recursive {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("ada"));

//        System.out.println(nolGenap(0));


//
//        cetakNums(5);

        for (int i = 0; i < 5; i++) {
            cetakChars(i);
//            System.out.println(starString(i));
        }

    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;   // base case
        } else {
            char first = s.charAt(0);
            char last  = s.charAt(s.length() - 1);
            if (first != last) {
                return false;
            }              // recursive case
            String middle = s.substring(1, s.length() - 1);
            return isPalindrome(middle);
        }
    }

    public static int nolGenap(int n) {
        if (n == 0) {
            return 0;
        } else {
            int num = n % 10;
            if (num % 2 == 0) {
                return num + nolGenap(n / 10) * 10;
            } else {
                return nolGenap(n / 10);
            }
        }
    }

    public static void cetakNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1");
        } else {
            cetakNums(n - 1);
            System.out.print(", " + n);
        }
    }

    public static void cetakChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            cetakChars(n - 2);
            System.out.print(">");
        }
    }

    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }

    public static boolean isReverse(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return true;
        } else if (a.length() == b.length()) {
            int length = b.length();
            char letter1 = Character.toUpperCase(a.charAt(0));
            char letter2 = Character.toUpperCase(b.charAt(length - 1));
            if (letter1 == letter2) {
                return isReverse(a.substring(1), b.substring(0, length - 1));
            } else {
                return false;
            }
        }
        return false;
    }
}
