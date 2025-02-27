package com.bridgelabz.controlflow.leveltwo;


import java.util.Scanner;

public class YoungestAndTallestPerson {
        public static void main(String[] args) {
            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Taking input for ages
            System.out.print("Enter Amar's age: ");
            int amarAge = scanner.nextInt();
            System.out.print("Enter Akbar's age: ");
            int akbarAge = scanner.nextInt();
            System.out.print("Enter Anthony's age: ");
            int anthonyAge = scanner.nextInt();

            // Taking input for heights (in cm)
            System.out.print("Enter Amar's height  ");
            double amarHeight = scanner.nextDouble();
            System.out.print("Enter Akbar's height  ");
            double akbarHeight = scanner.nextDouble();
            System.out.print("Enter Anthony's height ");
            double anthonyHeight = scanner.nextDouble();

            // Finding the youngest friend
            String youngest;
            if (amarAge < akbarAge && amarAge < anthonyAge) {
                youngest = "Amar";
            } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
                youngest = "Akbar";
            } else {
                youngest = "Anthony";
            }

            // Finding the tallest friend
            String tallest;
            if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
                tallest = "Amar";
            } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
                tallest = "Akbar";
            } else {
                tallest = "Anthony";
            }

            // Displaying the results
            System.out.println("\nThe youngest friend is: " + youngest);
            System.out.println("The tallest friend is: " + tallest);

            // Close the scanner
            scanner.close();
        }
    }

