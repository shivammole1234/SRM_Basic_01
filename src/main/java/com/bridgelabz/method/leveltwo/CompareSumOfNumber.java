package com.bridgelabz.method.leveltwo;
import java.util.Scanner;
public class CompareSumOfNumber {
    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        // Check if the input is a natural number
        if (n > 0) {
            // Calculate the sum using recursion
            int recursiveSum = sumUsingRecursion(n);
            // Calculate the sum using the formula
            int formulaSum = sumUsingFormula(n);
            // Display the results
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            // Compare the results
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are the same, so the computation is correct!");
            } else {
                System.out.println("There is a discrepancy between the results.");
            }
        } else {
            System.out.println("Please enter a natural number (greater than 0).");
        }
        scanner.close();
    }
}