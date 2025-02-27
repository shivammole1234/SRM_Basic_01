package com.bridgelabz.elements.leveltwo;

import java.util.Scanner;

public class DoubleOperation {
        public static void main(String[] args) {
            // Create a Scanner object for taking input
            Scanner scanner = new Scanner(System.in);
            // Take user input for a, b, and c
            System.out.print("Enter value for a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter value for b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter value for c: ");
            double c = scanner.nextDouble();
            // Perform the integer operations considering operator precedence
            double result1 = a + b * c;      // First operation: a + (b * c)
            double result2 = a * b + c;      // Second operation: (a * b) + c
            double result3 = c + a / b;      // Third operation: c + (a / b)
            double result4 = a % b + c;      // Fourth operation: (a % b) + c
            // Output the results of the operations
            System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

            // Close the scanner
            scanner.close();
        }
    }

