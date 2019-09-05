package com.xsis.day07.Inheritance;

public class Employee {

    private String name,ssn,emailAddress;
    private int yearOfBirth;
    private double salary;

    public Employee(String name, String ssn, String emailAddress, int yearOfBirth, double salary) {
        if (salary < 1.0) throw new IllegalArgumentException("salaray harus lebih dari 1");
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", salary=" + salary +
                '}';
    }
}
