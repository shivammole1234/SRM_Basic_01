package com.bridgelabz.method.leveltwo;
import java.util.Scanner;
public class YoungestAmongThree {
    // Method to find the index of the youngest friend
    public static int findYoungestIndex(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    // Method to find the index of the tallest friend
    public static int findTallestIndex(double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store age and height of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Taking user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        // Finding the youngest and tallest friends
        int youngestIndex = findYoungestIndex(ages);
        int tallestIndex = findTallestIndex(heights);
        // Displaying the results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
        scanner.close();
    }
}