package com.bridgelabz.elements.levelone;
import java.util.Scanner;
public class AreaOfTriangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Input base and height
            System.out.print("Enter base of the triangle: ");
            double base = input.nextDouble();
            System.out.print("Enter height of the triangle: ");
            double height = input.nextDouble();
            // Calculate area
            double areaInches = 0.5 * base * height;
            double areaCentimeters = areaInches * 6.4516; // 1 inch = 2.54 cm, so area in cm² is 1 inch² = 6.4516 cm²
            // Output
            System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCentimeters + " square centimeters.");
        }
    }
