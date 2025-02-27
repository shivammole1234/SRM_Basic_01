package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class MaxNumberOfHandshake {
    // Method to calculate the maximum number of handshakes
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        // Create an instance of MaxNumberOfHandshake
        MaxNumberOfHandshake handshakeCalculator = new MaxNumberOfHandshake();
        // Calculate the number of handshakes
        int handshakes = handshakeCalculator.calculateHandshakes(numberOfStudents);
        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        scanner.close();
    }
}
