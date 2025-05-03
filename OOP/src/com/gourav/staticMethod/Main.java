package com.gourav.staticMethod;

public class Main {
    public static void main(String[] args) {
        // static methods can be called without creating an object
        System.out.println(MathUtil.square(283));
        System.out.println(MathUtil.cube(23));

        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}

class MathUtil {
    static int square(int x) {
        return x * x;
    }

    static int cube(int y) {
        return y * y * y;
    }
}

// static nested class
class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}

