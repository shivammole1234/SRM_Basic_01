package com.bridgelabz.objectorienteddesign.companyanddepartments;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments; // Composition: Departments are part of Company

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Methods to manage departments
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

    // Display company structure
    public void displayStructure() {
        System.out.println("Company: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }

    // Note: No explicit destructor needed in Java. When Company is garbage collected,
    // all departments and employees are too, since they're only referenced here
}