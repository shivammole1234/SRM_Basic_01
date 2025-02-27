package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class TwoDimensionalToOneDimensional {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Take user input for the number of rows and columns
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            // Create a 2D array (Matrix) with the given rows and columns
            int[][] matrix = new int[rows][columns];
            // Take user input to fill the matrix
            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            // Create a 1D array with size equal to rows * columns
            int[] array = new int[rows * columns];
            // Index variable to store values in the 1D array
            int index = 0;
            // Copy elements of the matrix into the 1D array using nested loops
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[index++] = matrix[i][j]; // Copying element into 1D array
                }
            }
            // Display the 1D array
            System.out.println("\nThe 1D array after copying elements from the matrix:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            scanner.close();
        }
    }

