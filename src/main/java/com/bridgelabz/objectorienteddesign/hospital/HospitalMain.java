package com.bridgelabz.objectorienteddesign.hospital;

public class HospitalMain{
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors with Indian names
        Doctor doc1 = new Doctor("D001", "Dr. Priya Sharma", "Cardiology");
        Doctor doc2 = new Doctor("D002", "Dr. Arjun Patel", "Neurology");

        // Create patients with Indian names
        Patient pat1 = new Patient("P001", "Rohan Gupta");
        Patient pat2 = new Patient("P002", "Sneha Iyer");

        // Add to hospital
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Display initial hospital structure
        System.out.println("=== Initial Hospital Structure ===");
        hospital.displayStructure();

        // Demonstrate consultations (association and communication)
        System.out.println("\n=== Consultations ===");
        doc1.consult(pat1); // Dr. Priya consults Rohan
        doc1.consult(pat2); // Dr. Priya consults Sneha
        doc2.consult(pat1); // Dr. Arjun consults Rohan

        // Display relationships
        System.out.println("\n=== Doctor-Patient Relationships ===");
        doc1.displayPatients();
        doc2.displayPatients();
        pat1.displayDoctors();
        pat2.displayDoctors();
    }
}