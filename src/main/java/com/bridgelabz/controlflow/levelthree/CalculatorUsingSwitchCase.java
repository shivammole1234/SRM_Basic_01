package com.bridgelabz.controlflow.levelthree;
import java.util.Scanner;
public class CalculatorUsingSwitchCase {
        public static void main(String[] args) {
            // Create Scanner object to take user input
            Scanner scanner = new Scanner(System.in);
            // Take two double values and a string for the operator
            System.out.print("Enter the first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double second = scanner.nextDouble();
            // Get the operator as input
            System.out.print("Enter the operator (+, -, *, /): ");
            String op = scanner.next();
            // Perform the operation based on the operator using switch-case
            double result;
            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator.");
                    break;
            }
            // Close the scanner
            scanner.close();
        }
}
