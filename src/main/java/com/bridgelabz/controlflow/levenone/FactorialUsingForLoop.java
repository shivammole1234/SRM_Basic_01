package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class FactorialUsingForLoop {
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
                // Calculate factorial using for loop
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                // Display the result
                System.out.println("Factorial of " + number + " is: " + factorial);
            }
            // Close scanner to prevent resource leak
            scanner.close();
        }
    }
