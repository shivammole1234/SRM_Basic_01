package com.bridgelabz.Inheritance.EmployeeManagementSystem;

// Main class to test Employee hierarchy
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Rajesh Sharma", 101, 90000, 8);
        Developer developer = new Developer("Priya Verma", 102, 75000, "Java");
        Intern intern = new Intern("Amit Gupta", 103, 25000, 6);
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}
