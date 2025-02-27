package com.bridgelabz.initial.practice;
import java.util.Scanner;

public class DistanceKilloMetersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
