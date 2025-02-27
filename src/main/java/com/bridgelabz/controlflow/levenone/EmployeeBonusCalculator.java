package com.bridgelabz.controlflow.levenone;
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt user for salary input
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        // Prompt user for years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        // Bonus calculation: 5% of salary if service is more than 5 years
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        // Print the bonus amount
        System.out.println("Bonus Amount: $" + bonus);
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
