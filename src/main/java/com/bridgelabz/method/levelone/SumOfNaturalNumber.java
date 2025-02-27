package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class SumOfNaturalNumber {
    // Method to calculate the sum of n natural numbers using a loop
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n > 0) {
            // Create an instance of SumOfNaturalNumber
            SumOfNaturalNumber sumCalculator = new SumOfNaturalNumber();

            // Calculate the sum of n natural numbers
            int sum = sumCalculator.calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a natural number greater than 0.");
        }

        scanner.close();
    }
}
