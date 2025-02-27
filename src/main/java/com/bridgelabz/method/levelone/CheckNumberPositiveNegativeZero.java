package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class CheckNumberPositiveNegativeZero {
    // Method to check if a number is positive, negative, or zero
    public int checkNumberSign(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        // Create an instance of CheckNumber
        CheckNumberPositiveNegativeZero checkNumber = new CheckNumberPositiveNegativeZero();
        // Determine the sign of the number
        int result = checkNumber.checkNumberSign(number);
        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}
