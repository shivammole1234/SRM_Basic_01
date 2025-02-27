package com.bridgelabz.controlflow.levenone;

import java.util.Scanner;

public class EnterZeroToExit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize variables
        double total = 0.0;

        // Loop until the user enters zero or a negative number
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Exit loop if the input is zero or negative
            if (number <= 0) {
                break;
            }

            total += number;
        }

        // Display the total sum of numbers entered by the user
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
