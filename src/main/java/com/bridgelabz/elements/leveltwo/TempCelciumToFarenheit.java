package com.bridgelabz.elements.leveltwo;
import java.util.Scanner;
public class TempCelciumToFarenheit {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            // Ask the user to input temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            // Convert Celsius to Fahrenheit using the formula
            double fahrenheit = (celsius * 9/5) + 32;
            // Output the result
            System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
            // Close the scanner to free resources
            scanner.close();
        }
}
