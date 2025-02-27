package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class MeanHeightPlayer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Create an array to store the heights of 11 players
            double[] heights = new double[11];
            double sum = 0.0;
            // Get input for the heights of all players
            System.out.println("Enter the heights of the 11 players (in meters):");
            for (int i = 0; i < 11; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = scanner.nextDouble();
                sum += heights[i]; // Adding the height to the sum
            }
            // Calculate the mean height
            double meanHeight = sum / 11;
            // Display the mean height of the football team
            System.out.println("\nThe mean height of the football team is: " + meanHeight + " meters.");
            scanner.close();
        }
    }

