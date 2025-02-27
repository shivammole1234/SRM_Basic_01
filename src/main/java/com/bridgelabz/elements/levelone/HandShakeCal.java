package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class HandShakeCal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Input number of students
            System.out.print("Enter number of students: ");
            int numberOfStudents = input.nextInt();
            // Calculate number of handshakes using combination formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            // Output
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        }
    }
