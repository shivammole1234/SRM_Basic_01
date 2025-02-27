package com.bridgelabz.builtinfunction.level2;

import java.util.Scanner;

public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        // Taking input from the user
        int[] numbers = takeInput();

        // Finding the maximum
        int max = findMax(numbers[0], numbers[1], numbers[2]);

        // Displaying the result
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextInt();
        System.out.print("Enter third number: ");
        numbers[2] = scanner.nextInt();

        scanner.close();
        return numbers;
    }

    // Function to find the maximum of three numbers
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
