package com.bridgelabz.objectorienteddesign.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String name;
    private Professor professor; // Association/Aggregation with Professor
    private List<Student> students; // Aggregation with Student

    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
        this.students = new ArrayList<>();
        this.professor = null;
    }

    // Add student to course (aggregation)
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Set professor for course (association)
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    // Display course details
    public void displayDetails() {
        System.out.println("Course: " + name + " (" + courseId + ")");
        System.out.println("Taught by: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("Students:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("  - " + student.getName());
            }
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Encapsulation
    }
}