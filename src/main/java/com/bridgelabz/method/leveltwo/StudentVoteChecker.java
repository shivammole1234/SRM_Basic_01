package com.bridgelabz.method.leveltwo;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18; // Eligible to vote if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students
        // Taking input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        // Create an instance of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        System.out.println("\nVoting Eligibility Results:");
        // Checking eligibility for each student
        for (int age : ages) {
            if (voteChecker.canStudentVote(age)) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}
