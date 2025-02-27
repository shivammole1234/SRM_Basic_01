package com.bridgelabz.controlflow.levelthree;
import java.util.Scanner;
public class HarshadNumberDefiner {
        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Initialize variables
            int sum = 0;
            int originalNumber = number;
            // Loop to sum the digits of the number
            while (originalNumber > 0) {
                int digit = originalNumber % 10; // Extract last digit
                sum += digit; // Add digit to sum
                originalNumber /= 10; // Remove last digit
            }
            // Check if the number is a Harshad Number
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is not a Harshad Number.");
            }
            // Close scanner
            scanner.close();
        }
}
