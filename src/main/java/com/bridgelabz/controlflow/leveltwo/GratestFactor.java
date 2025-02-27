package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class GratestFactor {

        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Taking user input
            System.out.print("Enter a number: ");
            int numberToFindGreatestFactor = scanner.nextInt();
            // Variable to store the greatest factor
            int greatestFactor = 1;
            // Loop from number - 1 to 1
            for (int i = numberToFindGreatestFactor - 1; i >= 1; i--) {
                if (numberToFindGreatestFactor % i == 0) {  // Check if i is a factor
                    greatestFactor = i;
                    break; // Break after finding the greatest factor
                }
            }

            // Display the greatest factor
            System.out.println("The greatest factor of " + numberToFindGreatestFactor + " (excluding itself) is: " + greatestFactor);

            // Close scanner
            scanner.close();
        }
    }

