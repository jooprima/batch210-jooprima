package com.xsis.day06OOP;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.print();

        System.out.println();

        car.goFaster("450km/jam","300",5,48,35);
        car.print();

//        Car c1 = new Car("Kijang","100km/jam","50",5);
//        Car c2 = new Car("Ferari","255km/jam","150",6);
//
//        c1.print();
//        c2.print();


    }
}
