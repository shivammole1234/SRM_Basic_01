package com.bridgelabz.objectorienteddesign.companyanddepartments;

public class CompanyMain {
        public static void main(String[] args) {
            // Create company
            Company techCorp = new Company("TechCorp");

            // Create departments (composed within company)
            Department engineering = new Department("Engineering");
            Department hr = new Department("HR");

            // Add departments to company
            techCorp.addDepartment(engineering);
            techCorp.addDepartment(hr);

            // Create employees (composed within departments)
            Employee emp1 = new Employee("Alice Smith", "E001", 75000.0);
            Employee emp2 = new Employee("Bob Johnson", "E002", 80000.0);
            Employee emp3 = new Employee("Carol Williams", "H001", 65000.0);

            engineering.addEmployee(emp1);
            engineering.addEmployee(emp2);
            hr.addEmployee(emp3);

            // Display initial structure
            System.out.println("Initial company structure:");
            techCorp.displayStructure();

            // Remove a department (demonstrates management within composition)
            techCorp.removeDepartment("HR");
            System.out.println("\nAfter removing HR department:");
            techCorp.displayStructure();

            // Demonstrate composition: setting techCorp to null would make all
            // departments and employees eligible for garbage collection
            // techCorp = null; // Uncomment to simulate company deletion
            // After this, engineering, hr, emp1, emp2, emp3 would all be cleaned up

    }
}
