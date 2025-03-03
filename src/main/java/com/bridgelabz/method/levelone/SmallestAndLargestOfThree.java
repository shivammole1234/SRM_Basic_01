package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class SmallestAndLargestOfThree {
    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        // Determine the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        // Determine the largest number
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        // Find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}
