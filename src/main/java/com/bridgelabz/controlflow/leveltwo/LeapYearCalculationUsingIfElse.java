package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class LeapYearCalculationUsingIfElse {
    public static void main(String[] args) {
        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Check if the year is divisible by 400
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
            // Check if the year is divisible by 100 but not by 400
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            }
            // Check if the year is divisible by 4 but not by 100
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
            // Otherwise, it is not a Leap Year
            else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
