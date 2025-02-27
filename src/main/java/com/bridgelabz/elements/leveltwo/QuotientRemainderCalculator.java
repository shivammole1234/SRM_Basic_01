package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        // Take two numbers as input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        // Output the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two numbers " + number1 + " and " + number2);
        // Close the scanner
        scanner.close();
    }
}