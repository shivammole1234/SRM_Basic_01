package com.bridgelabz.method.leveltwo;

import java.util.Arrays;

public class RandomFunction {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); // Generates a 4-digit number
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max value of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomFunction randomFunction = new RandomFunction();

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = randomFunction.generate4DigitRandomArray(5);

        // Find the average, min, and max values
        double[] results = randomFunction.findAverageMinMax(randomNumbers);

        // Display the random numbers
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumbers));

        // Display the average, min, and max values
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", results[0], results[1], results[2]);
    }
}
