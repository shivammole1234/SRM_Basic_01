package com.bridgelabz.method.levelone;

import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Create an instance of SimpleInterestCalculator
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Calculating Simple Interest
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate + "% and Time " + time + " years.");

        scanner.close();
    }
}
