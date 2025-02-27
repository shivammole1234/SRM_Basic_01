package com.bridgelabz.method.leveltwo;
public class UnitConverterThree {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        // Example usage of the UnitConverterThree class
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        double celsiusInput = 37.0;
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is equal to " + fahrenheitConverted + " Fahrenheit.");

        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        double kilogramsInput = 68.0;
        double poundsConverted = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsConverted + " pounds.");

        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        double litersInput = 18.9;
        double gallonsConverted = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsConverted + " gallons.");
    }
}
