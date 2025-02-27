package com.bridgelabz.oops.employeemanagement;

public class EmployeeSystem {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Shivam Mole", "Software Engineer");
        Employee emp2 = new Employee(2, "Aditya Patil", "Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
