//package com.xsis.day06OOP.Overriding;
//
//import com.xsis.day06OOP.Employee;
//
//public class Manager extends Employee {
//
//    private String responsibility;
//
//    public  Manager(String name,String ssn,String responsibility){
//        super(name,ssn);
//        this.responsibility = responsibility;
//    }
//
//
//    public void setResponsibility(String responsibility) {
//        this.responsibility = responsibility;
//    }
//
//    public String getResponsibility() {
//        return responsibility;
//    }
//
//    public void print(String header, String footer){
//        super.print(header, null);
//        System.out.println("Responsibility : " + responsibility);
//
//        if (footer != null){
//            System.out.println(footer);
//        }
//    }
//}
