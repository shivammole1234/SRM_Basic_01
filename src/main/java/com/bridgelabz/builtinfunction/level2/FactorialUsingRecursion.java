package com.bridgelabz.builtinfunction.level2;

import java.util.Scanner;

public class FactorialUsingRecursion {

    // Function to take user input
    private static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Recursive function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }

    // Function to display the result
    private static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args) {
        // Take user input
        int number = takeInput();

        // Calculate factorial using recursion
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }


}
