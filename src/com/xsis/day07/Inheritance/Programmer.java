package com.xsis.day07.Inheritance;

import com.xsis.day07.Interfaces.EmployeeInterface;

public class Programmer extends Employee implements EmployeeInterface {

    private int masaKerja;

    public Programmer(String name, String ssn, String emailAddress, int yearOfBirth, double salary, int masaKerja) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
        this.masaKerja = masaKerja;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("method call from object programmer");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(Double potongan) {
        super.setSalary(super.getSalary() - potongan);
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    @Override
    public double getSalary() {
        double bonus = super.getSalary();
        if (this.masaKerja > 10){
            bonus = 5 *super.getSalary();
        }else if (this.masaKerja < 10){
            bonus = 2 * super.getSalary();
        }
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus = " + getSalary() + ", masa kerja = " + masaKerja + '}';
    }
}
