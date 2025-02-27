package com.bridgelabz.string.level1;

import java.util.Scanner;

public class ToggleCaseCharOfString {
    // Function to toggle the case of each character
    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is lowercase or uppercase and toggle the case
            if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else {
                // If it's neither (like a space or special character), just append as is
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the input string from user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Call the toggleCase function and print the result
        String result = toggleCase(input);
        System.out.println("Toggled Case: " + result);

        // Close the scanner object
        scanner.close();
    }
}
