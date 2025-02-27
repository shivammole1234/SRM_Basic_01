package com.bridgelabz.initial.practice;
 import java.util.Scanner;

    public class AreaCicle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
        }
    }

