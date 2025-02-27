package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1; // Variable to store factorial result
            int counter = 1; // Counter for loop iteration

            // Calculate factorial using while loop
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
