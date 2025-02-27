package com.bridgelabz.controlflow.leveltwo;
import java.util.Scanner;
public class GradeCalculator {
        public static void main(String[] args) {
            // Create a scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            // Declare variables to store marks for Physics, Chemistry, and Maths
            double physics, chemistry, maths;
            // Take input for the marks of the three subjects
            System.out.print("Enter marks for Physics: ");
            physics = scanner.nextDouble();
            System.out.print("Enter marks for Chemistry: ");
            chemistry = scanner.nextDouble();
            System.out.print("Enter marks for Maths: ");
            maths = scanner.nextDouble();
            // Calculate the total marks and percentage
            double totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300) * 100;
            // Output the percentage
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            // Calculate the grade and remarks based on percentage
            if (percentage >= 80) {
                System.out.println("Grade: A");
                System.out.println("Remarks: Level 4, above agency-normalized standards");
            } else if (percentage >= 70) {
                System.out.println("Grade: B");
                System.out.println("Remarks: Level 3, at agency-normalized standards");
            } else if (percentage >= 60) {
                System.out.println("Grade: C");
                System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
            } else if (percentage >= 50) {
                System.out.println("Grade: D");
                System.out.println("Remarks: Level 1, well below agency-normalized standards");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");
                System.out.println("Remarks: Level 1-, too below agency-normalized standards");
            } else {
                System.out.println("Grade: R");
                System.out.println("Remarks: Remedial standards");
            }
            // Close the scanner object
            scanner.close();
        }
}
