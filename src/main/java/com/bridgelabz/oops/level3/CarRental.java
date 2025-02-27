package com.bridgelabz.oops.level3;

class CarRental {
    // Private attributes for encapsulation
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        this("Unknown Customer", "Standard", 1); // Calls parameterized constructor
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = Math.max(rentalDays, 1); // Ensuring at least 1 rental day
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Setter with validation
    public void setRentalDays(int rentalDays) {
        if (rentalDays > 0) {
            this.rentalDays = rentalDays;
        } else {
            System.out.println("Rental days must be positive.");
        }
    }

    // Method to get the daily rental rate based on car model
    private double getDailyRate() {
        switch (carModel.toLowerCase()) {
            case "suv":
                return 80.0;
            case "sedan":
                return 60.0;
            case "luxury":
                return 120.0;
            default:
                return 50.0; // Standard car
        }
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return getDailyRate() * rentalDays;
    }

    // Method to display rental details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRentalInfo();

        System.out.println("----------------------");

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Aditya Pawar", "SUV", 5);
        rental2.displayRentalInfo();

        System.out.println("----------------------");

        // Modifying rental days using setter
        rental2.setRentalDays(7);
        System.out.println("Updated Rental Info:");
        rental2.displayRentalInfo();
    }
}
