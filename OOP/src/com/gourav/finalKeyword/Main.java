package com.gourav.finalKeyword;
//| Use Case      | Meaning                                         |
//        | ------------- | ----------------------------------------------- |
//        | Variables | Value cannot be changed (constant)              |
//        | Methods   | Cannot be overridden by subclasses              |
//        | Classes   | Cannot be inherited (no subclass can extend it) |

public class Main {
    public static void main(String[] args) {
        Example u = new Example();
        u.show();

        Greeting g = new Greeting();
        g.greet("gourav");
    }
}

class Example {
    final int MAX_USERS = 100;

    public void show() {
        // MAX_USERS = 300;  compile time error
        System.out.println("Max Users: " + MAX_USERS);
    }
}

// final parameters
class Greeting {
    public void greet(final String name) {
        // name = "GOURAV"; not allowed
        System.out.println("Hey, " + name);
    }
}

// Final Methods
class Parent {
    public final void showMessage() {
        System.out.println("This can't be overridden");
    }
}

class Child extends  Parent {
//    public void showMessage() {} compile time error
}

// Final Classes -> Prevents a class from being extended
final class Base {
    public void display() {
        System.out.println("Final class: can't be inherited");
    }
}

// class Derived extends  Base {} -> can't extend