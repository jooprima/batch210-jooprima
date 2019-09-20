package com.xsis.quiz04.Soal04;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hour Salary : ");
        double hourSalary = sc.nextDouble();

        System.out.print("Hour : ");
        double hour = sc.nextDouble();

        Salary salaryAll = new Salary();

        salaryAll.getGaji(hourSalary,hour);

    }

    private void getGaji(double salary,double hour){
        double gaji;

        if (hour > 8 ){
            gaji = 8 * salary + (hour - 8) * (1.5 * salary);
            System.out.println((int)gaji);
        }else if (hour <= 8){
            gaji = hour * salary;
            System.out.println((int)gaji);
        }else {
            gaji = salary;
            System.out.println(gaji);
        }
    }

}
