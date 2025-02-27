package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Check if the number is positive
        if (number > 0) {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it is neither divisible by 3 nor 5
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner object
        scanner.close();
    }
}
