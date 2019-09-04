package com.xsis.day06OOP;

public class Employee {
    String name;
    String ssn;
    String emailAddress;
    int yearOfBirth;
    int BaseVacationDays;
    int ExtraVacationDays;


    //membuat constructor dengan this
    Employee(String name, String ssn) {
        this.name = name; // "this" help distinguish between
        this.ssn = ssn; //instance and parameter variable
    }


    //    membuat method untuk print
    void print() {
        System.out.println("Name : " + name);
        System.out.println("SSN : " + ssn);
//        System.out.println("Email : " + emailAddress);
        System.out.println();
    }
}


