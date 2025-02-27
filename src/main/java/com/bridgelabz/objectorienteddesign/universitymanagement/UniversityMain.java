package com.bridgelabz.objectorienteddesign.universitymanagement;

public class UniversityMain {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "Amit Patel");
        Student student2 = new Student("S002", "Neha Sharma");

        // Create professors
        Professor prof1 = new Professor("P001", "Dr. Vikram Singh", "Computer Science");
        Professor prof2 = new Professor("P002", "Dr. Priya Menon", "Physics");

        // Create courses
        Course course1 = new Course("CS101", "Programming Fundamentals");
        Course course2 = new Course("PHY101", "Mechanics");

        // Assign professors to courses (association)
        prof1.assignProfessor(course1);
        prof2.assignProfessor(course2);

        // Enroll students in courses (association)
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display information
        System.out.println("\n=== Course Information ===");
        course1.displayDetails();
        System.out.println();
        course2.displayDetails();

        System.out.println("\n=== Student Enrollments ===");
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();

        System.out.println("\n=== Professor Teaching Assignments ===");
        prof1.displayCourses();
        System.out.println();
        prof2.displayCourses();
    }
}