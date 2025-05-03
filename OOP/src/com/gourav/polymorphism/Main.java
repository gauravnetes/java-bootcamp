package com.gourav.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();

        Shape s2 = new Rectangle();
        s2.area();

        Rectangle r = new Rectangle();
        r.area(5, 23);
        r.area(23);
    }
}

class Shape {
    public void area() {
        System.out.println("Calculating Area of a Generic shape: ");
    }
}

class Circle extends Shape {
    double radius = 9;
    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Calculating area of reactangle");
    }

    public void area(int len, int breadth) {
        System.out.println("Area of Rectangle: " + len * breadth);
    }

    public void area(int side) {
        System.out.println("Area of Sqquare: " + side * side);
    }
}
