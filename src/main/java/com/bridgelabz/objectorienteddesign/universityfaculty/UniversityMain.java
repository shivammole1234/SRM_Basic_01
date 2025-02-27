package com.bridgelabz.objectorienteddesign.universityfaculty;

public class UniversityMain {
    public static void main(String[] args) {
        // Create university
        University uni = new University("Central University");

        // Create departments (composed within university)
        Department compSci = new Department("Computer Science");
        Department physics = new Department("Physics");

        // Add departments to university
        uni.addDepartment(compSci);
        uni.addDepartment(physics);

        // Create faculty members (exist independently)
        Faculty prof1 = new Faculty("Dr. Alice Smith", "F001", "AI");
        Faculty prof2 = new Faculty("Dr. Bob Johnson", "F002", "Quantum Mechanics");
        Faculty prof3 = new Faculty("Dr. Carol Williams", "F003", "Data Structures");

        // Assign faculty to departments (aggregation)
        compSci.addFaculty(prof1);
        compSci.addFaculty(prof3);
        physics.addFaculty(prof2);

        // Display initial structure
        System.out.println("=== Initial University Structure ===");
        uni.displayStructure();

        // Remove a faculty member from a department (aggregation persists)
        compSci.removeFaculty(prof1);
        System.out.println("\n=== After Removing Dr. Alice from CompSci ===");
        uni.displayStructure();
        System.out.println("Independent Faculty: " + prof1); // prof1 still exists

        // Remove a department (composition effect)
        uni.removeDepartment("Physics");
        System.out.println("\n=== After Removing Physics Department ===");
        uni.displayStructure();
        System.out.println("Independent Faculty: " + prof2); // prof2 still exists

        // Simulate university deletion
        System.out.println("\n=== Simulating University Deletion ===");
        uni = null; // Departments are now eligible for garbage collection
        // Faculty members (prof1, prof2, prof3) still exist independently
        System.out.println("Faculty still exists: " + prof3);
    }
}
