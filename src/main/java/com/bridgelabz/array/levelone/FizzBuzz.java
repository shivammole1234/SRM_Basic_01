package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class FizzBuzz {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take user input for the number
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();
            // Check if the number is positive
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return; // Exit if the number is not positive
            }
            // Create a String array to store the results
            String[] results = new String[number + 1];
            // Loop through numbers from 0 to the input number
            for (int i = 0; i <= number; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i); // Store the number as string
                }
            }
            // Loop again to print the results in the specified format
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
            scanner.close();
        }
}
