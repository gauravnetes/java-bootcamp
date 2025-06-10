package com.chandra.charFreq;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Convert to lowercase for uniform counting (optional)
        input = input.toLowerCase();

        // Remove spaces (optional, if you don't want to count them)
        input = input.replace(" ", "");

        // HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Count characters using charAt
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Display frequency
        System.out.println("Character frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + " : " + frequencyMap.get(ch));
        }

        scanner.close();
    }
}
