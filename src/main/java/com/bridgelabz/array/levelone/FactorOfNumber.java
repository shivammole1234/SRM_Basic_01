package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Initialize the maximum factor size and the factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        // Loop through numbers from 1 to the entered number to find the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                factors[index++] = i;
                // If the index reaches maxFactor, resize the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size of the array
                    int[] temp = new int[maxFactor];
                    // Copy elements from the old array to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    // Assign the new array back to factors
                    factors = temp;
                }
            }
        }
        // Display the factors of the number
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        scanner.close();
    }
}

