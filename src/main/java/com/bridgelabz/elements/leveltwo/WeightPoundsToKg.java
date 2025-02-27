package com.bridgelabz.elements.leveltwo;

import java.util.Scanner;

public class WeightPoundsToKg {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Taking input for weight in pounds
            System.out.print("Enter the weight in pounds: ");
            double weightInPounds = scanner.nextDouble();
            // Converting pounds to kilograms
            double weightInKg = weightInPounds / 2.2;
            // Displaying the result
            System.out.println("The weight of the person in pounds is " + weightInPounds +
                    " and in kilograms is " + weightInKg);
            scanner.close();
        }
    }

