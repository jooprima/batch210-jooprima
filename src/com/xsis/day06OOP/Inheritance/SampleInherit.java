package com.xsis.day06OOP.Inheritance;

public class SampleInherit {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();


        a.a = "AAA";
        b.a = "B'nya A";
        b.b = "BBBBBB";
        c.a = "Who Caresss";
        c.b = "Bodo Amattt";
        c.c = "CCC";


        a.doA();
        b.doB();
        c.doA();
        c.doB();
        c.doC();

    }


}
