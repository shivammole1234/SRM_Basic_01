package com.bridgelabz.method.levelone;

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate various trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an instance of TrigonometricFunctionsCalculator
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();

        // Calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);

        scanner.close();
    }
}
