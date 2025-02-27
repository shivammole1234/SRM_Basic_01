package com.bridgelabz.array.leveltwo;
import java.util.Scanner;
public class DigitOfNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take user input for the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Array to store the digits of the number
            int[] digits = new int[10];  // maxDigits set to 10 for a 10-digit number
            int index = 0;
            int maxDigits = 10;
            // Extract digits and store them in the array
            while (number != 0) {
                digits[index] = number % 10;  // Store the last digit
                number = number / 10;         // Remove the last digit
                index++;
                if (index == maxDigits) {
                    break;
                }
            }
            // Variables to store the largest and second largest digit
            int largest = -1;
            int secondLargest = -1;
            // Find the largest and second largest digit in the array
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] < largest) {
                    secondLargest = digits[i];
                }
            }
            // Display the results
            if (largest == -1 || secondLargest == -1) {
                System.out.println("There are not enough distinct digits.");
            } else {
                System.out.println("Largest digit: " + largest);
                System.out.println("Second largest digit: " + secondLargest);
            }
            scanner.close();
        }
    }