package com.xsis.day07.Inheritance;

import com.xsis.day07.Interfaces.EmployeeInterface;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("ucup","123-123-1","ucup@mail.com",2009,9000000);
        System.out.println(e1.toString());

//        Manager m1 = new Manager("ucup","123-123-1","ucup@mail.com",2009,9000000);
//        System.out.println(m1.toString());


        EmployeeInterface emi = new Manager("mamat","124-143-2","mamat@mail.com",2006,7500000,0.0);
//        emi.potongGaji(120);
//        emi.getInfoEmployee();

        Programmer p1 = new Programmer("mamat","124-143-2","mamat@mail.com",2006,7500000,9);
        Programmer p2 = new Programmer("wawna","126-146-5","wawan@mail.com",2001,5500000,12);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();

        EmployeeInterface eip1 = new Programmer("mamat","124-143-2","mamat@mail.com",2006,7500,9);
        eip1.potongGaji(120.0);
        eip1.getInfoEmployee();

    }
}
