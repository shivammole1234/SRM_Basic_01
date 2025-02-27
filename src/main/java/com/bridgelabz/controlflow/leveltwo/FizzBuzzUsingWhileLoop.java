package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Initialize the counter
        int i = 1;
        // Use a while loop to iterate from 1 to the entered number
        while (i <= number) {
            // Check if the current number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the current number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the current number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if it is not divisible by 3 or 5
            else {
                System.out.println(i);
            }
            // Increment the counter
            i++;
        }
        // Close the scanner object
        scanner.close();
    }
}
