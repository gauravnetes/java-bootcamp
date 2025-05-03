package com.gourav.interfaces;

public class Main {
    public static void main(String[] args) {
        Flyable b = new Bird();
        b.fly();

        Flyable p = new Plane();
        p.fly();
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird Flyes Naturally");
    }
}

class Plane implements Flyable {
    @Override
    public void fly(){
        System.out.println("Plane flied Artificially");
    }
 }