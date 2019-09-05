package com.xsis.day07.Inheritance;

import com.xsis.day07.Interfaces.EmployeeInterface;

public class Manager extends Employee implements  EmployeeInterface{

    private double comission;

    public Manager(String name, String ssn, String emailAddress, int yearOfBirth, double salary, double comission) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public double getSalary() {
        double totalComission = this.comission * super.getSalary();
        return super.getSalary() + totalComission;
    }

    @Override
    public String toString() {
        return super.toString() + ", comission = " + this.comission + ", salary + commision = " + getSalary();
    }

    @Override
    public String getInfoEmployee(){
        System.out.println("method call from objek manager");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(Double potongan) {
        super.setSalary(super.getSalary()-potongan);
    }

}
