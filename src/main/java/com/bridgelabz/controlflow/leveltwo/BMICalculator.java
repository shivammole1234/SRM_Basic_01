package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Taking user input for weight in kg
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        // Taking user input for height in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();
        // Convert height from cm to meters
        double heightMeters = heightCm / 100;
        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);
        // Display the calculated BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);
        // Determine weight status based on BMI value
        if (bmi < 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
        // Close the scanner
        scanner.close();
    }
}
