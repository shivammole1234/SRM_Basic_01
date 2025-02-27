package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;
public class EnterZeroToStop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

            double total = 0.0; // Initialize the variable to store the sum of numbers
            while (true) {
                System.out.print("Enter a number (0 to stop): ");
                double number = scanner.nextDouble();
                // If the entered number is zero, exit the loop
                if (number == 0) {
                    break;
                }
                total += number;
            }
            // Print the total sum after exiting the loop
            System.out.println("Total sum: " + total);
        }
}
