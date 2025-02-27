package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class SimpleInterestCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Taking input for Principal, Rate, and Time
            System.out.print("Enter the Principal amount: ");
            double principal = scanner.nextDouble();
            System.out.print("Enter the Rate of Interest (in %): ");
            double rate = scanner.nextDouble();
            System.out.print("Enter the Time (in years): ");
            double time = scanner.nextDouble();
            // Calculating Simple Interest
            double simpleInterest = (principal * rate * time) / 100;
            // Displaying the result
            System.out.println("The Simple Interest is " + simpleInterest +
                    " for Principal " + principal +
                    ", Rate of Interest " + rate + "% and Time " + time + " years.");
            scanner.close();
        }
    }