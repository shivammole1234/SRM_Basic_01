package basic01;

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Output
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
