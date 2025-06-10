package com.chandra.fibonacci;
import java.util.*;

public class Main {

    public static int fb(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fb(n - 1) + fb(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get how many terms to display
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fb(i) + " ");
        }

        scanner.close();
    }
}
