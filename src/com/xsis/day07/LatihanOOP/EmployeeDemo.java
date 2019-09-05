package com.xsis.day07.LatihanOOP;

import java.sql.SQLOutput;

public class EmployeeDemo {

    public static void main(String[] args) {

        //membuat objek baru
        Employee e1 = new Employee("ucup", "123-123-1", "ucup@mail.com", 2009, 9000000);
        Employee e2 = new Employee("mamat", "124-143-2", "mamat@mail.com", 2006, 7500000);
        Employee e3 = new Employee("junedi", "125-145-3", "juned@mail.com", 2007, 7200000);
        Employee e4 = new Employee("wawna", "126-146-5", "wawan@mail.com", 2001, 5500000);
        Employee e5 = new Employee("agus", "127-147-6", "agus@mail.com", 2006, 3500000);

        //inisialisasi array/membuat objek baru untuk array
        Employee[] listEmployee = {e1, e2, e3, e4, e5};
        EmployeeDemo ed = new EmployeeDemo();

        //memanggil method sesuai parameter
//        ed.findAll(listEmployee);
        ed.findBySsn(listEmployee, "125-145-3");
    }

    void findAll(Employee[] le) {
        System.out.println("Find All Employeee");
        System.out.println("Nama      SSN      Email      Year      Salary");

        for (int i = 0; i < le.length; i++) {
            System.out.printf("%s   %s   %s   %s   %s   \n", le[i].getName(), le[i].getSsn(), le[i].getEmailAddress(), le[i].getYearOfBirth(), le[i].getSalary());
        }
    }

    void findBySsn(Employee[] le, String ssn) {
        System.out.println("Find Employee by SSN = " + ssn + "\n");

        int found = 0;

        for (int i = 0; i < le.length; i++) {
            if (le[i].getSsn() == ssn) {
                found = 1;
                System.out.printf("%s   %s   %s   %s   %s   \n", le[i].getName(), le[i].getSsn(), le[i].getEmailAddress(), le[i].getYearOfBirth(), le[i].getSalary());
                break;
            }
        }
        if (found == 0) {
            System.out.println("Employee with ssn " + ssn + " not found");
        }
    }

//    void maxSalary(Employee[] le) {
//        System.out.println("Employee dengan gaji tertinggi : ");
//
//        double max = 0;

//        for (int i = 0; i < le.length; i++) {
//            if (le[i].getSalary() > max) {
//                max = le[i].getSalary();
//            } else {
//                max = max;
//            }
//        }
//
//        for (int i = 0; i < le.length; i++) {
//            if (le[i].getSalary())
//        }
//    }
}



