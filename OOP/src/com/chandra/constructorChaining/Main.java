package com.chandra.constructorChaining;

class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0);
        System.out.println("Default Constructor called");
    }

    Student(String name) {
        this(name, 0);  // Constructor chaining
        System.out.println("Constructor with name called.");
    }

    Student(String name, int age) {
        this.name = name; // 'this' keyword to refer to instance variable
        this.age = age;
        System.out.println("Constructor with name and age called.");
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Student 1: ");
        Student s1 = new Student();
        s1.display();

        System.out.println("Student 2: ");
        Student s2 = new Student("Gourav");
        s2.display();

        System.out.println("Student 3: ");
        Student s3 = new Student("Gourav", 20);
        s3.display();
    }
}
