package com.bridgelabz.elements.leveltwo;

import java.util.Scanner;

public class SwapTwoElements {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            // Ask the user for the first number
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();
            // Ask the user for the second number
            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();
            // Print the numbers before swapping
            System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);
            // Swap the numbers using a temporary variable
            int temp = number1;
            number1 = number2;
            number2 = temp;
            // Print the swapped numbers
            System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
            // Close the scanner to free up resources
            scanner.close();
        }
    }