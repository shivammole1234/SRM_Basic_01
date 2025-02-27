package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class ChocolateDistribution {
    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Handling the case when numberOfChildren is zero to avoid division by zero error
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children!");
        } else {
            // Calculate the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            // Display the results
            System.out.println("The number of chocolates each child gets is " + result[0] +
                    " and the number of remaining chocolates are " + result[1]);
        }
        scanner.close();
    }
}