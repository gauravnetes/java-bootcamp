package com.gourav.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayDetails("gourav", 23432);
        Manager m = new Manager();
        m.displayDetails("chandra",  79823, "Ops");
    }
}

class Employee {
    String name;
    double salary;

    public void displayDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Name: "+ name + "Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    public void displayDetails(String name, double salary, String department) {
        super.displayDetails(name, salary);
        this.department = department;
        System.out.println("Department: " + department);
    }
}


