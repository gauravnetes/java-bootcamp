package com.chandra.singleInheritance;

class  Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound () {
        System.out.println("Animal makess a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor called");
    }

    @Override
    void sound() {
        System.out.println("Barkk");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
