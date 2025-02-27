package com.bridgelabz.elements.levelone;

import java.util.Scanner;

public class SideFromPerimeter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Input perimeter
            System.out.print("Enter perimeter of the square: ");
            double perimeter = input.nextDouble();
            // Calculate side
            double side = perimeter / 4;
            // Output
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
