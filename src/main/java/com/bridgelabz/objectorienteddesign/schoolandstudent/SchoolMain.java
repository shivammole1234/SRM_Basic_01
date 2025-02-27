package com.bridgelabz.objectorienteddesign.schoolandstudent;

public class SchoolMain {
    public static void main(String[] args) {
        // Create school
        School mySchool = new School("CS Kothari Public School");

        // Create students (exist independently)
        Student abhishek = new Student("S001", "Abhishek Pawar");
        Student saurav = new Student("S002", "Saurabh Patil");

        // Add students to school (aggregation)
        mySchool.addStudent(abhishek);
        mySchool.addStudent(saurav);

        // Create courses
        Course math = new Course("MATH101", "Mathematics");
        Course science = new Course("SCI101", "Science");

        // Enroll students in courses (association)
        math.enrollStudent(abhishek);
        math.enrollStudent(saurav);
        science.enrollStudent(abhishek);

        // Display information
        System.out.println("=== School Structure ===");
        mySchool.displayStudents();

        System.out.println("\n=== Student Courses ===");
        abhishek.displayEnrolledCourses();
        saurav.displayEnrolledCourses();

        System.out.println("\n=== Course Enrollment ===");
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();

        // Demonstrate aggregation: Remove student from school, but student persists
        mySchool.removeStudent(saurav);
        System.out.println("\n=== After Removing Bob from School ===");
        mySchool.displayStudents();
        saurav.displayEnrolledCourses(); // Bob still exists and has courses
    }
}
