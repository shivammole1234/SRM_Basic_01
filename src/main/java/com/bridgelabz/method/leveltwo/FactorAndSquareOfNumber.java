package com.bridgelabz.method.leveltwo;

import java.util.Scanner;

public class FactorAndSquareOfNumber {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();


        // Calculate and display the sum of the factors
        int sum = calculateSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculate and display the product of the factors
        int product = calculateProduct(factors);
        System.out.println("Product of factors: " + product);

        // Calculate and display the sum of squares of the factors
        int sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }
}
