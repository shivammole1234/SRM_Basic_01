package com.bridgelabz.controlflow.levelthree;
import java.util.Scanner;
public class CheckArmstrongNumber {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Initializing variables
        int sum = 0;
        int originalNumber = number;
        // Loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit * digit * digit;    // Cube of digit and add to sum
            originalNumber /= 10;            // Remove last digit
        }
        // Check if the number is Armstrong
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        // Close scanner
        scanner.close();
    }
}
