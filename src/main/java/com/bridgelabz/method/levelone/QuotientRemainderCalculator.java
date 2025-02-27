package com.bridgelabz.method.levelone;

import java.util.Scanner;

public class QuotientRemainderCalculator {

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero to avoid division by zero error
        if (divisor != 0) {
            // Calculate the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the quotient and remainder
            System.out.println("The Quotient is " + result[0] + " and Remainder is " + result[1] +
                    " for the numbers " + number + " and " + divisor);
        } else {
            System.out.println("Divisor cannot be zero.");
        }

        scanner.close();
    }
}
