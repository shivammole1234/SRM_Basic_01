package com.bridgelabz.objectorienteddesign.schoolandstudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Course> enrolledCourses; // Association with Course

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course (called by Course.enrollStudent)
    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    // Drop a course (called by Course.removeStudent)
    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " (" + studentId + ")");
        System.out.println("Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println("  " + course.getName() + " (" + course.getCourseId() + ")");
            }
        }
    }

    public List<Course> getEnrolledCourses() {
        return new ArrayList<>(enrolledCourses); // Return a copy for encapsulation
    }
}