package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class TempFarenheitToCelcius {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            // Ask the user to input temperature in Fahrenheit
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            // Convert Fahrenheit to Celsius using the formula
            double celsius = (fahrenheit - 32) * 5/9;
            // Output the result
            System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
            // Close the scanner to free resources
            scanner.close();
        }
    }
