package com.bridgelabz.objectorienteddesign.companyanddepartments;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees; // Composition: Employees are part of Department

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Methods to manage employees
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
        employees.removeIf(emp -> emp.getId().equals(employeeId));
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees); // Return a copy for encapsulation
    }

    public String getName(){
        return name;
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("  " + emp);
        }
    }
}