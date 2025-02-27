package com.bridgelabz.objectorienteddesign.schoolandstudent;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String name;
    private List<Student> enrolledStudents; // Association with Student

    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in this course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this); // Maintain bidirectional association
        }
    }

    // Remove a student from this course
    public void removeStudent(Student student) {
        if (enrolledStudents.contains(student)) {
            enrolledStudents.remove(student);
            student.dropCourse(this); // Maintain bidirectional association
        }
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    // Display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + name + " (" + courseId + ")");
        System.out.println("Enrolled Students:");
        if (enrolledStudents.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println("  " + student.getName() + " (" + student.getStudentId() + ")");
            }
        }
    }

    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents); // Return a copy for encapsulation
    }
}