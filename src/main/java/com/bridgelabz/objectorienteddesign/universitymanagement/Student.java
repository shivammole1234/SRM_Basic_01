package com.bridgelabz.objectorienteddesign.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Course> courses; // Association with Course

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in a course (association and communication)
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Bidirectional association
            System.out.println(name + " enrolled in " + course.getName());
        }
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Display enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name + " (" + studentId + ")");
        if (courses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (Course course : courses) {
                System.out.println("  - " + course.getName());
            }
        }
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // Encapsulation
    }
}