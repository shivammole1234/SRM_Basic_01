package com.bridgelabz.builtinfunction.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate modifiedDate = date.plusDays(7)  // Add 7 days
                .plusMonths(1) // Add 1 month
                .plusYears(2)  // Add 2 years
                .minusWeeks(3); // Subtract 3 weeks

        // Define a formatter for output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display the results
        System.out.println("Original Date: " + date);
        System.out.println("Modified Date after operations: " + modifiedDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
