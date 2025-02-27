package com.bridgelabz.string.level1;

import java.util.Scanner;

public class FrequencyOfSubString {
    public static int countSubstringOccurrences(String mainStr, String subStr) {
        if (subStr.isEmpty() || mainStr.length() < subStr.length())
            return 0;

        int count = 0, index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the found occurrence
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        // Count occurrences
        int count = countSubstringOccurrences(mainString, subString);
        System.out.println("Occurrences of \"" + subString + "\": " + count);

        scanner.close();
    }

    // Method to count occurrences of a substring in a string

}
