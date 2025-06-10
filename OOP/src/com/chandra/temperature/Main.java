package com.chandra.temperature;
import java.util.*;

public class Main {

    public static double celsiusToFahrenheit (double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature in Celsius from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert and display
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
