package com.bridgelabz.method.leveltwo;

import java.util.Scanner;

public class CheckLeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Leap year is divisible by 4 and not divisible by 100 or divisible by 400
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        scanner.close();
    }
}
