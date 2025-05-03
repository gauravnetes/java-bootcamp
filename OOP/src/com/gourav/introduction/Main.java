package com.gourav.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        String[] names = new String[5];

//        data of 5 students {rno, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
//        creating objects
        Student student1; // declare the object
        student1 = new Student(31, "Gourav", 42.22f);
        System.out.println(Arrays.toString(students));
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}