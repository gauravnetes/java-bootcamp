package com.gourav;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no. ");
        int rollNo = sc.nextInt();
        System.out.println("Your roll no is: " + rollNo);

        // type casting
        int num = (int) (24.2323f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 454;
        byte b = (byte) (a);
        System.out.println(b);
    }
}
