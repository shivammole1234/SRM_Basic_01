package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class BasiCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Input numbers
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();
            // Perform operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number1 / number2;
            // Print results
            System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        }
    }

