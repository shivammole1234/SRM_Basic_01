package com.bridgelabz.objectorienteddesign.universityfaculty;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Faculty> facultyMembers; // Aggregation with Faculty

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Methods to manage faculty (aggregation)
    public void addFaculty(Faculty faculty) {
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Faculty> getFacultyMembers() {
        return new ArrayList<>(facultyMembers); // Return a copy for encapsulation
    }

    // Display department details
    public void displayFaculty() {
        System.out.println("Department: " + name);
        System.out.println("Faculty Members:");
        if (facultyMembers.isEmpty()) {
            System.out.println("  No faculty assigned.");
        } else {
            for (Faculty faculty : facultyMembers) {
                System.out.println("  " + faculty);
            }
        }
    }
}