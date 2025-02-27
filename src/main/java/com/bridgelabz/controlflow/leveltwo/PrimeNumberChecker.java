package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class PrimeNumberChecker {
        public static void main(String[] args) {
            // Create a scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Declare a boolean variable isPrime and initialize it as true
            boolean isPrime = true;
            // Check if the number is greater than 1
            if (number <= 1) {
                isPrime = false;  // Numbers less than or equal to 1 are not prime
            } else {
                // Loop through numbers from 2 to number-1 to check divisibility
                for (int i = 2; i < number; i++) {
                    // If the number is divisible by i, it's not a prime number
                    if (number % i == 0) {
                        isPrime = false;
                        break;  // Break the loop as we found a divisor
                    }
                }
            }
            // Output the result based on the isPrime value
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
            // Close the scanner object
            scanner.close();
        }
}
