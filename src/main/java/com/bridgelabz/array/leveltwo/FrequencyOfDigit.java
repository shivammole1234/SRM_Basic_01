package com.bridgelabz.array.leveltwo;
import java.util.Scanner;
public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Initialize the frequency array to store counts of digits (0 to 9)
        int[] frequency = new int[10];
        // Loop through the number to calculate the frequency of each digit
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            frequency[digit]++;       // Increment the count for this digit
            number = number / 10;     // Remove the last digit
        }
        // Display the frequency of each digit (from 0 to 9)
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only print the digits that appear
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
        scanner.close();
    }
}
