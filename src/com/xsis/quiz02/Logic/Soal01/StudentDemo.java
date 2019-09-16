package com.xsis.quiz02.Logic.Soal01;

public class StudentDemo {
    public static void main(String[] args) {
        Student std1 = new Student("123","joo","informatika");
        Student std2 = new Student("124","prima","komputer");
        Student std3 = new Student("125","yohanes","akuntansi");
        Student std4 = new Student("126","trisnanto","manajemen");
//        Student std5 = new Student("127","ucup","informatika");

        System.out.println("Total Student = " + Student.totalStudent);
    }
}
