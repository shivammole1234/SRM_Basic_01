package com.bridgelabz.method.levelone;

import java.util.Scanner;

public class DetectSpringSeason {

    // Method to check if the given date is in the spring season
    public boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        int day;
        int month;
        // Read input for the day and month
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day = scanner.nextInt();
        System.out.print("Enter the month: ");
        month = scanner.nextInt();
        // Create an instance of DetectSpringSeason
        DetectSpringSeason springSeasonChecker = new DetectSpringSeason();

        // Check if it's a spring season
        boolean isSpring = springSeasonChecker.isSpringSeason(month, day);

        // Display the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
