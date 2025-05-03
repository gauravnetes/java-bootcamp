package com.gourav.gcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        B a = new B();
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.println(a.findGCD(p1, p2));
    }
}


interface  GCD {
    public int findGCD(int a, int b);
}

class B implements GCD {
    public int findGCD(int n1, int n2) {
        if(n1 < 0 || n2 < 0) {
            return -1;
        }
        if(n2 == 0)
            return n1;

        return findGCD(n2, n1 % n2);
    }
}