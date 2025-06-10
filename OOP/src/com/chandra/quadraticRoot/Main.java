package com.chandra.quadraticRoot;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        System.out.println("Quadratic Equation: " + a + "x² + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + r);
        } else {
            double rPart = -b / (2 * a);
            double iPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + rPart + " + " + iPart + "i");
            System.out.println("Root 1 = " + rPart + " - " + iPart + "i");
        }
        scanner.close();
    }
}
