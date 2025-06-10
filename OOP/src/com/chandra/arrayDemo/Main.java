package com.chandra.arrayDemo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        int min = numbers[0];
        int max = numbers[9];

        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        double avg = sum / 10.0;

        System.out.println("\nSorted numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);

        scanner.close();
    }
}
