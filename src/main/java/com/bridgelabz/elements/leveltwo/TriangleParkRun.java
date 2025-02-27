package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class TriangleParkRun {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Taking input for the three sides of the triangular park
            System.out.print("Enter side 1 (in meters): ");
            double side1 = scanner.nextDouble();
            System.out.print("Enter side 2 (in meters): ");
            double side2 = scanner.nextDouble();
            System.out.print("Enter side 3 (in meters): ");
            double side3 = scanner.nextDouble();
            // Calculating the perimeter of the triangular park
            double perimeter = side1 + side2 + side3;
            // Total distance to be covered (5 km = 5000 meters)
            double totalDistance = 5000;
            // Calculating the number of rounds required
            int rounds = (int) Math.ceil(totalDistance / perimeter);
            // Displaying the result
            System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
            scanner.close();
        }
    }
