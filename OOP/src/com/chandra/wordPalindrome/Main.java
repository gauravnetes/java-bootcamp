package com.chandra.wordPalindrome;
import java.util.*;
import java.io.*;


public class Main {

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while(left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for file name
        System.out.print("Enter the file name (with path if needed): ");
        String filename = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("\nPalindrome words found in the file:");
            while ((line = br.readLine()) != null) {
                // Split line into words using regex (non-word characters as delimiters)
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty() && isPalindrome(word.toLowerCase())) {
                        System.out.println(word);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}
