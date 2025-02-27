package com.bridgelabz.array.levelone;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students
        // Taking input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        System.out.println("\nVoting Eligibility Results:");
        // Checking eligibility for each student
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        scanner.close();
    }
}
