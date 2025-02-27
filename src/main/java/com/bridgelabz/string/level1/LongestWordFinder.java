package com.bridgelabz.string.level1;
import java.util.Scanner;

public class LongestWordFinder {

    public static String[] findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split sentence by spaces
        String longestWord = "";

        for (String word : words) {
            // Remove punctuation (optional)
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return new String[]{ longestWord,String.valueOf(longestWord.length())  };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find and print the longest word
        String[] longestWord = findLongestWord(sentence);
        System.out.println("Longest word: " + longestWord[0]);
        System.out.println("Length of longest word: "+longestWord[1]);

        scanner.close();
    }

    // Method to find the longest word in a sentence

}
