package com.bridgelabz.objectorienteddesign.universityfaculty;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments; // Composition with Department

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Methods to manage departments (composition)
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(String deptName) {
        departments.removeIf(dept -> dept.getName().equals(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.getName().equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    // Display university structure
    public void displayStructure() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        if (departments.isEmpty()) {
            System.out.println("  No departments.");
        } else {
            for (Department dept : departments) {
                dept.displayFaculty();
            }
        }
    }

    // Note: When University is garbage collected, all departments are too (composition)
    // Faculty members persist independently (aggregation)
}