package com.bridgelabz.objectorienteddesign.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String professorId;
    private String name;
    private String department;
    private List<Course> courses; // Association with Course

    public Professor(String professorId, String name, String department) {
        this.professorId = professorId;
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    // Assign professor to a course (association and communication)
    public void assignProfessor(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setProfessor(this); // Bidirectional association
            System.out.println(name + " assigned to teach " + course.getName());
        }
    }

    // Getters
    public String getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Display taught courses
    public void displayCourses() {
        System.out.println("Professor: " + name + " (" + professorId + ")");
        if (courses.isEmpty()) {
            System.out.println("  No courses assigned.");
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