package com.xsis.day06OOP.Encapsulation;

public class EmployeeEncaps {

    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfBirth;

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


    void print() {
        System.out.println("Name : " + name);
        System.out.println("SSN : " + ssn);
//        System.out.println("Email : " + emailAddress);
        System.out.println();
    }

}
