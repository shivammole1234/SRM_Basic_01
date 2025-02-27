package com.bridgelabz.objectorienteddesign.schoolandstudent;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students; // Aggregation with Student

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Remove a student from the school
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Display school information
    public void displayStudents() {
        System.out.println("School: " + name);
        System.out.println("Students:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("  " + student.getName() + " (" + student.getStudentId() + ")");
            }
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Return a copy for encapsulation
    }
}