package com.gourav.defaultmethod;

public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.startEngine();
        c.stopEngine();

        Vehicle b = new Bike();
        b.startEngine();
        b.stopEngine();
    }
}

interface Vehicle {
    default void startEngine() {
        System.out.println("Vehicle engine started");
    }

    default void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("car engine started.. ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("bike engine started");;
    }
}