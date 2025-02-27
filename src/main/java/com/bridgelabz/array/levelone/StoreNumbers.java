package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class StoreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define an array to store up to 10 numbers (using double type for flexibility)
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (Enter 0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();
            // Break the loop if input is 0, negative, or if index exceeds 9 (array size 10)
            if (userInput <= 0 || index >= 10) {
                break;
            }
            // Store the number in the array and increment the index
            numbers[index] = userInput;
            index++;
        }
        // Calculate the total sum of numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        // Display the numbers entered and the total sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("\nThe total sum of all numbers is: " + total);
        scanner.close();
    }
}