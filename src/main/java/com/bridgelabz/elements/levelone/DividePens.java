package com.bridgelabz.elements.levelone;

public class DividePens {
        public static void main(String[] args) {
            int totalPens = 14;  // hardcoded input
            int totalStudents = 3;// hardcoded input
            int pensPerStudent = totalPens / totalStudents;
            int remainingPens = totalPens % totalStudents;

            System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
        }
    }


