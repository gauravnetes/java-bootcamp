package com.gourav.overriding;

interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class
class Main implements First, Second {
    // Overriding default show method to resolve conflict
    public void show() {
        // Call show() of First interface
        First.super.show();

        // Call show() of Second interface
        Second.super.show();
    }

    public static void main(String[] args) {
        Main q = new Main();
        q.show();
    }
}