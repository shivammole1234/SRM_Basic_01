package com.bridgelabz.method.leveltwo;
import java.util.Scanner;
public class BMICalculator {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100; // Convert height from cm to meters
        return weight / (heightMeters * heightMeters);
    }
    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array to store weight, height, and BMI

        // Taking user input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();

            // Calculate BMI and store it in the array
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        System.out.println("\nBMI Results:");
        // Display the height, weight, BMI, and status for each person
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = determineBMIStatus(bmi);

            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n",
                    (i + 1), weight, height, bmi, status);
        }

        scanner.close();
    }
}
