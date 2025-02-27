package com.bridgelabz.elements.leveltwo;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        // Handling the case when numberOfChildren is zero to avoid division by zero error
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children!");
        } else {
            // Calculating chocolates per child and remaining chocolates
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            // Displaying the results
            System.out.println("The number of chocolates each child gets is " +chocolatesPerChild +" and the number of remaining chocolates are "+remainingChocolates);

        }

        scanner.close();
    }
}
