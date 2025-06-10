package com.chandra.armstrongNum;
import java.util.*;

public class Main {

    public static boolean isArmstrong (int num) {
        int original = num;
        double sum = 0;

        int n = Integer.toString(num).length();

        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check and display result
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
