package com.xsis.day06OOP;

public class Car {
    String NameCar;
    String Speed;
    String RPM;
    int Gear;
    int fuelLevel;
    String licensePlate;
    int engineTemperature;




    void start(){
        System.out.println("Engine start............");
        NameCar = "Lamborjini";
        licensePlate = "B 2222 KKK";
        Speed = "200km/jam";
        RPM = "55";
        Gear = 6;
        fuelLevel = 5;
        engineTemperature = 39;

    }

    void goFaster(String Speed,String RPM,int Gear,int fuelLevel,int engineTemperature){
        System.out.println("Go Faster..............");
        this.Speed = Speed;
        this.RPM = RPM;
        this.Gear = Gear;
        this.fuelLevel = fuelLevel;
        this.engineTemperature = engineTemperature;
    }


    void print(){
        System.out.println("Name Car : " + NameCar);
        System.out.println("license Plate: " + licensePlate);
        System.out.println("Speed : " + Speed);
        System.out.println("RPM : " + RPM);
        System.out.println("Gear : " + Gear);
        System.out.println("Fuel Level : " + fuelLevel);
        System.out.println("Engine Temperature : " + engineTemperature);
    }
}
