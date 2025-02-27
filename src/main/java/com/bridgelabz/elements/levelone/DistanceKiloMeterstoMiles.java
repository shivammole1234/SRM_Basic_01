package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class DistanceKiloMeterstoMiles {
    public static void main(String[] args) {
        double kilometers = 10.8; // hardcoded input
        double miles = kilometers * 1.6; // converting km to miles

        // printing the output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);

                Scanner input = new Scanner(System.in); // created the object of Scanner class
                System.out.print("Enter distance in kilometers: ");
                double km = input.nextDouble(); // taking the input for km

                double miles1 = km * 1.6; // doing the calculation

        // printing the final result
                System.out.println("The total miles is " + miles1 + " miles for the given " + km + " km");
            }
        }


