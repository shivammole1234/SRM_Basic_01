package com.bridgelabz.method.levelone;
import java.util.Scanner;
public class WindChillTemp {
    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();
        // Create an instance of WindChillTemp
        WindChillTemp windChillCalculator = new WindChillTemp();
        // Calculate the wind chill temperature
        double windChill = windChillCalculator.calculateWindChill(temperature, windSpeed);
        // Display the result
        System.out.println("The wind chill temperature is: " + windChill);
        scanner.close();
    }
}