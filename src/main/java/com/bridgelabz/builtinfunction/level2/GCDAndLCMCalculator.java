package com.bridgelabz.builtinfunction.level2;


import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Function to take user input
    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        return new int[]{num1, num2};
    }

    // Function to calculate GCD using Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the results
    private static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static void main(String[] args) {
        // Take user input
        int[] numbers = takeInput();

        int num1 = numbers[0];
        int num2 = numbers[1];

        // Calculate GCD
        int gcd = calculateGCD(num1, num2);

        // Calculate LCM
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResult(num1, num2, gcd, lcm);
    }

}
