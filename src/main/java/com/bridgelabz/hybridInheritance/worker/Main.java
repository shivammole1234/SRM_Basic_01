package com.bridgelabz.hybridInheritance.worker;

// Main class to test Hybrid Inheritance
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Arjun", 101, "Indian Cuisine");
        Waiter waiter = new Waiter("Ravi", 102, 5);

        System.out.println("🔹 Chef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n🔹 Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
