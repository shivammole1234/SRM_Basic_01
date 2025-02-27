package com.bridgelabz.array.leveltwo;
import java.util.Scanner;
public class ReverseNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take user input for the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Count the number of digits in the number
            int count = 0;
            int tempNumber = number;
            while (tempNumber != 0) {
                count++;
                tempNumber = tempNumber / 10;  // Remove the last digit
            }
            // Create an array to store the digits
            int[] digits = new int[count];
            // Store the digits of the number in the array
            int index = 0;
            while (number != 0) {
                digits[index] = number % 10;  // Extract the last digit
                number = number / 10;         // Remove the last digit
                index++;
            }
            // Display the reversed digits
            System.out.print("Reversed number: ");
            for (int i = 0; i < count; i++) {
                System.out.print(digits[i]);
            }
            scanner.close();
        }
}
