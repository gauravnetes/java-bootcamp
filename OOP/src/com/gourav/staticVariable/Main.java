package com.gourav.staticVariable;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(23, "gourav");
        Student s2 = new Student(24, "chandra");

        s1.display();
        s2.display();
    }
}

class Student {
    int id;
    String name;
    static String college = "GNIT";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
