package com.gourav.abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.startEngine();
        c.fuelType();;

        Vehicle e = new ElectricCar();
        e.startEngine();
        e.fuelType();
    }
}

abstract class Vehicle{
    abstract void startEngine();
    public void fuelType() {
        System.out.println("Generic fuel type");
    }
}

class Car extends Vehicle{
    public void startEngine() {
        System.out.println("Car engine started");
    }
    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Petrol");
    }
}

class ElectricCar extends Vehicle {
    public void startEngine() {
        System.out.println("EV engine started");
    }
    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Electric");
    }
}