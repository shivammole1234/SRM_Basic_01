package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class TotalIncomeCalculator {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            // Ask the user for the salary
            System.out.print("Enter salary in INR: ");
            double salary = scanner.nextDouble();
            // Ask the user for the bonus
            System.out.print("Enter bonus in INR: ");
            double bonus = scanner.nextDouble();
            // Calculate the total income
            double totalIncome = salary + bonus;
            // Display the result
            System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
            // Close the scanner to free up resources
            scanner.close();
        }
}
