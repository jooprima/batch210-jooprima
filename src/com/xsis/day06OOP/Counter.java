package com.xsis.day06OOP;

public class Counter {

    static int counter = 0;

    public static void main(String[] args) {
        Increment();
        System.out.println("Counter : " + counter);

        Decrement();
        System.out.println("Counter : " + counter);
    }

    static void Increment(){
        counter += 5;
    }

    static void Decrement(){
        counter -= 1;
    }
}
