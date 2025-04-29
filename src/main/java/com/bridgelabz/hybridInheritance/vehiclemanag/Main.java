package com.bridgelabz.hybridInheritance.vehiclemanag;

// Main class to test Hybrid Inheritance
public class Main {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 220, 75);
        PetrolVehicle swift = new PetrolVehicle("Maruti Swift", 180, 40);

        System.out.println("🔹 Electric Vehicle Details:");
        tesla.displayInfo();
        tesla.charge();

        System.out.println("\n🔹 Petrol Vehicle Details:");
        swift.displayInfo();
        swift.refuel();
    }
}
