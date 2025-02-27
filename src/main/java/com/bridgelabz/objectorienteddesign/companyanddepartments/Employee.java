package com.bridgelabz.objectorienteddesign.companyanddepartments;

public class Employee {
    private String name;
    private String id;
    private double salary;

    // Constructor
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s (ID: %s), Salary: $%.2f", name, id, salary);
    }
}