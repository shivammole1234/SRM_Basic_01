package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class ConvertHeight {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your height in centimeters: ");
            double heightCm = input.nextDouble();
            // Convert cm to inches
            double heightInches = heightCm / 2.54;
            // Convert inches to feet and remaining inches
            int feet = (int) heightInches / 12;
            double inches = heightInches % 12;
            System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        }
    }