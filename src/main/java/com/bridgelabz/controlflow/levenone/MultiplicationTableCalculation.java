package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;

public class MultiplicationTableCalculation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number for the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
