package com.bridgelabz.Inheritance.VehicleTransportSystem;

// Main class to test Vehicle hierarchy and polymorphism
public class Main {
    public static void main(String[] args) {
        // Creating different vehicle objects
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15.5);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Storing all vehicles in an array
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Displaying information using polymorphism
        System.out.println("🔹 Vehicle Information:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("------------------------");
        }
    }
}
