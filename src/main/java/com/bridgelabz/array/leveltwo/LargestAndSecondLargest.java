package com.bridgelabz.array.leveltwo;
import java.util.Scanner;
public class LargestAndSecondLargest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take user input for the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            // Initial size of the digits array (for up to 10 digits)
            int maxDigits = 10;
            int[] digits = new int[maxDigits];  // Array to store the digits
            int index = 0;
            // Extract digits and store them in the array
            while (number != 0) {
                digits[index] = number % 10;  // Store the last digit
                number = number / 10;         // Remove the last digit
                index++;
                // If the array is full, increase its size by 10
                if (index == maxDigits) {
                    maxDigits += 10;  // Increase the size by 10
                    // Create a new array with the increased size
                    int[] temp = new int[maxDigits];
                    // Copy the elements from the old array to the new array
                    System.arraycopy(digits, 0, temp, 0, digits.length);
                    digits = temp;  // Assign the new array to the original digits array
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
