package com.bridgelabz.array.leveltwo;

import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Take user input for salary and years of service, validate input
            while (true) {
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                salary[i] = scanner.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                    continue;
                }
                break;
            }

            // Calculate bonus and new salary based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5% bonus for more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02;  // 2% bonus for 5 years or less of service
            }

            newSalary[i] = salary[i] + bonus[i];

            // Update total amounts
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the details for all employees
        System.out.println("\nEmployee Details and Bonus Calculation:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        // Print total bonus payout, total old salary, and total new salary
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
