package com.bridgelabz.elements.levelone;

public class VolumeOfEarth {
        public static void main(String[] args) {
            double pi = 3.14159265359;
            double radius = 6378;  // radius of the Earth in kilometers
            // Volume in cubic kilometers
            double volumeKmCube = (4.0 / 3.0) * pi * Math.pow(radius, 3);
            // Convert volume to cubic miles
            double volumeMilesCube = volumeKmCube * 0.239913;
            System.out.println("The volume of earth in cubic kilometers is " + String.format("%.3f",volumeKmCube) + " and cubic miles is " + String.format("%.3f",volumeMilesCube));
        }
    }


