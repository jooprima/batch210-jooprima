package com.xsis.day06OOP.Encapsulation;

public class EmployeeEncapsMain {

    public static void main(String[] args) {

        EmployeeEncaps e3 = new EmployeeEncaps();

        //memanggil objek private
        e3.setName("ucuupp");

        // yang ini gabisa dipanggil karna sudah di privat klas,
//        e3.name = "wanwan";

        e3.setSsn("123123123");
        e3.print();

        System.out.println(e3.getName());

    }

}
