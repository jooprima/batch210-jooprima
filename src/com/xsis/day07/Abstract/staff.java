package com.xsis.day07.Abstract;

public class staff extends Employee {

    public staff(String name, String ssn, String emailAddress, int yearOfBirth, double salary) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
    }

    @Override
    public Double getGajiTotal() {
        return super.getSalary();
    }
}
