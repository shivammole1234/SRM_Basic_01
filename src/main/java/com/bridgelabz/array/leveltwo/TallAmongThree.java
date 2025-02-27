package com.bridgelabz.array.leveltwo;
import java.util.Scanner;
public class TallAmongThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Arrays to store age and height of the three friends
            int[] age = new int[3];
            double[] height = new double[3];
            // Names of the friends for easy reference
            String[] names = {"Amar", "Akbar", "Anthony"};
            // Taking user input for age and height of each friend
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the age of " + names[i] + ": ");
                age[i] = scanner.nextInt();
                System.out.println("Enter the height of " + names[i] + ": ");
                height[i] = scanner.nextDouble();
            }
            // Finding the youngest friend
            int youngestIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (age[i] < age[youngestIndex]) {
                    youngestIndex = i;
                }
            }
            // Finding the tallest friend
            int tallestIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (height[i] > height[tallestIndex]) {
                    tallestIndex = i;
                }
            }
            // Displaying the youngest and the tallest
            System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + age[youngestIndex]);
            System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + height[tallestIndex] + " meters.");
            scanner.close();
        }
}
