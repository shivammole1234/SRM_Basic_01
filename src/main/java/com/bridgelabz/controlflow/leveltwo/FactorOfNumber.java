package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class FactorOfNumber {
        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Displaying factors
            System.out.println("Factors of " + number + " are:");
            // Loop to find factors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) { // Check if number is divisible by i
                    System.out.print(i + " ");
                }
            }
            // Close scanner
            scanner.close();
        }
    }