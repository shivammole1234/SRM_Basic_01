package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        // Take user input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform the integer operations considering operator precedence
        int result1 = a + b * c;      // First operation: a + (b * c)
        int result2 = a * b + c;      // Second operation: (a * b) + c
        int result3 = c + a / b;      // Third operation: c + (a / b)
        int result4 = a % b + c;      // Fourth operation: (a % b) + c
        // Output the results of the operations
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        // Close the scanner
        scanner.close();
    }
}
