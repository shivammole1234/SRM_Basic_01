package com.bridgelabz.oops.universitymanagement;

public class Student {
    private static String universityName = "RGPV University"; // Static variable
    private final int rollNumber; // Final variable
    private String studentName;
    private String studentGrade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.studentName = name;
        this.studentGrade = grade;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + studentName);
            System.out.println("Grade: " + studentGrade);
        }
    }

}
