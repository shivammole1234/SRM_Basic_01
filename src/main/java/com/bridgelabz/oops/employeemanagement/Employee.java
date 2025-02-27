package com.bridgelabz.oops.employeemanagement;

public class Employee {

    private static String companyName = "Accenture"; // Static variable
    private static int totalEmployees = 0; // Static counter
    private final int employeeId; // Final variable
    private String employeeName;
    private String designation;

    public Employee(int employeeId, String employeeName, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

}
