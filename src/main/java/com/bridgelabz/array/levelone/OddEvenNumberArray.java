package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class OddEvenNumberArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Taking user input for the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Check if the number is a valid natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return; // Exit the program if the input is not a natural number
            }
            // Calculate the size for the odd and even arrays
            int size = number / 2 + 1;
            // Create arrays for odd and even numbers
            int[] oddNumbers = new int[size];
            int[] evenNumbers = new int[size];
            // Index variables for odd and even arrays
            int oddIndex = 0, evenIndex = 0;
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex++] = i; // Store even numbers in the even array
                } else {
                    oddNumbers[oddIndex++] = i; // Store odd numbers in the odd array
                }
            }
            // Print the odd numbers array
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i] + " ");
            }
            // Print the even numbers array
            System.out.print("\nEven numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i] + " ");
            }
            scanner.close();
        }
    }