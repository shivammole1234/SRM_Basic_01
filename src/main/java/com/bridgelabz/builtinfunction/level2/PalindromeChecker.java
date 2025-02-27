package com.bridgelabz.builtinfunction.level2;

import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if the string is a palindrome
    private static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove spaces, special characters & convert to lowercase
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }

    // Function to display the result
    private static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a palindrome.");
        }
    }
    public static void main(String[] args) {
        // Take user input
        String input = takeInput();

        // Check if the input string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        displayResult(input, isPalindrome);
    }

    // Function to take user input
    private static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }


}
