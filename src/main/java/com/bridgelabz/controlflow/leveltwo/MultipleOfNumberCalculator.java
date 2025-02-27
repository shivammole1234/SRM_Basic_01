package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class MultipleOfNumberCalculator {
        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Taking user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Displaying multiples
            System.out.println("Multiples of " + number + " below 100:");
            // Looping backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (number %i == 0) { // Check if i is a multiple of number
                    System.out.print(i + " ");
                }
            }
            // Close scanner
            scanner.close();
        }
    }