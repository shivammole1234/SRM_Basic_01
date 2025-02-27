package com.bridgelabz.method.leveltwo;
import java.util.Scanner;
public class CheckNumber {
    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers
        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nNumber Analysis:");
        // Checking each number in the array
        for (int num : numbers) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        // Comparing the first and last elements
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        System.out.println("\nComparison of First and Last Elements:");
        int comparisonResult = compare(firstElement, lastElement);
        if (comparisonResult == 1) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else if (comparisonResult == -1) {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element and the last element are equal (" + firstElement + ").");
        }
        scanner.close();
    }
}