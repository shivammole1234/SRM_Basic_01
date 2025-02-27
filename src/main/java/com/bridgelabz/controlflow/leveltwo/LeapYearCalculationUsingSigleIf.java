package com.bridgelabz.controlflow.leveltwo;

import java.util.Scanner;

public class LeapYearCalculationUsingSigleIf {
        public static void main(String[] args) {
            // Create a scanner object to read input from user
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            // Check if the year is greater than or equal to 1582
            if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            } else {
                System.out.println("Year must be greater than or equal to 1582.");
            }
            // Close the scanner
            scanner.close();
        }
    }
