package com.bridgelabz.string.level1;
import java.util.Scanner;
public class CompareTwoString {

    // Function to compare two strings lexicographically
    public static void compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare the strings character by character
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // If characters are different, decide based on their Unicode value
            if (char1 < char2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } else if (char1 > char2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                return;
            }
        }

        // If all characters are the same till the shorter length, the shorter string comes first
        if (str1.length() < str2.length()) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (str1.length() > str2.length()) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal lexicographically");
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take two string inputs from the user
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Compare the strings
        compareStrings(string1, string2);

        // Close the scanner object
        scanner.close();
    }
}
