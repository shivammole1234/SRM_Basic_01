package com.bridgelabz.controlflow.levelthree;
import java.util.Scanner;
public class AbundantNumberCalculator {
        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Initialize the sum of divisors
            int sum = 0;
            // Loop to find the divisors and calculate the sum
            for (int i = 1; i < number; i++) {
                if (number % i == 0) { // Check if i is a divisor of number
                    sum += i; // Add divisor to sum
                }
            }
            // Check if the sum of divisors is greater than the number
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is not an Abundant Number.");
            }
            // Close the scanner
            scanner.close();
        }
    }