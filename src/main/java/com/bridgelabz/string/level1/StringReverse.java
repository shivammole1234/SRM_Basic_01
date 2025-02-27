package com.bridgelabz.string.level1;

import java.util.Scanner;

public class StringReverse {

    // Method to reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // Convert the string to a character array
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the beginning and end, moving towards the center
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray); // Convert the character array back to a string
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }


}