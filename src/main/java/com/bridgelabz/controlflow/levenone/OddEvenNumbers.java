package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        // Creating Scanner
        Scanner scanner = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        // Check if the entered number is a natural number & greater than 0
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }
    }
}
