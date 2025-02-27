package com.bridgelabz.controlflow.levelthree;
import java.util.Scanner;
public class DayOfWeekCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Take the month, day, and year as input from the user
        System.out.print("Enter the month (1-12): ");
        int inputMonth = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int inputDay = scanner.nextInt();
        System.out.print("Enter the year (e.g., 2023): ");
        int inputYear = scanner.nextInt();
        // Apying the formulas to calculate the day of the week
        int y0 = inputYear - (14 - inputMonth) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = inputMonth + 12 * ((14 - inputMonth) / 12) - 2;
        int d0 = (inputDay + x + 31 * m0 / 12) % 7;
        // Output the day of the week based on the result (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
        // Close the scanner
        scanner.close();
    }
}