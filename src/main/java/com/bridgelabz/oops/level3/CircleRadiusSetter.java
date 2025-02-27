package com.bridgelabz.oops.level3;

class CircleRadiusSetter {
    // Private attribute for encapsulation
    private double radius;

    // Default constructor (calls parameterized constructor)
    public CircleRadiusSetter() {
        this(1.0); // Default radius is set to 1.0
    }

    // Parameterized constructor
    public CircleRadiusSetter(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method with validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        // Using default constructor
        CircleRadiusSetter circle1 = new CircleRadiusSetter();
        circle1.displayInfo();

        // Using parameterized constructor
        CircleRadiusSetter circle2 = new CircleRadiusSetter(5.5);
        circle2.displayInfo();

        // Modifying radius using setter
        circle2.setRadius(3.0);
        System.out.println("Updated Radius: " + circle2.getRadius());
        System.out.println("Updated Area: " + circle2.calculateArea());
    }
}
