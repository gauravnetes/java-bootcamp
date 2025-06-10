class Student {
    static int count = 0;  // Static variable to count number of students

    String name;

    // Constructor
    Student(String name) {
        this.name = name;
        count++; // Increment count each time object is created
    }

    // Instance method to display student details
    void displayStudent() {
        System.out.println("Student Name: " + name);
    }

    // Static method to display total students
    static void displayCount() {
        System.out.println("Total number of students: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        // Display count using static method
        Student.displayCount();
    }
}



// Abstract class
abstract class Shape {
    abstract void area();  // Abstract method
}

// Subclass implementing abstract method
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.area();
    }
}



import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept paragraph
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        int vowels = 0, consonants = 0;
        paragraph = paragraph.toLowerCase();  // Make case-insensitive

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        // Output
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}



class Product {
    String name;
    double price;
    double discount;

    // Constructor with name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0;
    }

    // Overloaded constructor with name, price, and discount
    Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Method to calculate discounted price
    double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price After Discount: ₹" + getDiscountedPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000, 10);

        p1.display();
        p2.display();
    }
}



interface Sports {
    int sportScore = 25;
    void displaySportScore();
}

class Student {
    String name;
    int academicScore;

    Student(String name, int academicScore) {
        this.name = name;
        this.academicScore = academicScore;
    }

    void displayAcademicScore() {
        System.out.println("Student Name: " + name);
        System.out.println("Academic Score: " + academicScore);
    }
}

// Class that extends Student and implements Sports
class Result extends Student implements Sports {

    Result(String name, int academicScore) {
        super(name, academicScore);
    }

    public void displaySportScore() {
        System.out.println("Sports Score: " + sportScore);
    }

    public static void main(String[] args) {
        Result r = new Result("Anita", 85);
        r.displayAcademicScore();
        r.displaySportScore();
    }
}



import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, not anagram
        if (str1.length() != str2.length())
            return false;

        // Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two strings
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        // Check anagram
        if (isAnagram(s1, s2)) {
            System.out.println("They are anagrams.");
        } else {
            System.out.println("They are not anagrams.");
        }

        scanner.close();
    }
}

