package com.bridgelabz.objectorienteddesign.hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialty;
    private List<Patient> patients; // Association with Patient

    public Doctor(String doctorId, String name, String specialty) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    // Add a patient to doctor's list (maintains association)
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Maintain bidirectional association
        }
    }

    // Remove a patient from doctor's list
    public void removePatient(Patient patient) {
        if (patients.contains(patient)) {
            patients.remove(patient);
            patient.removeDoctor(this); // Maintain bidirectional association
        }
    }

    // Consultation method to demonstrate communication
    public void consult(Patient patient) {
        addPatient(patient); // Automatically associate if not already done
        System.out.println("Consultation:");
        System.out.println("  Doctor: " + name + " (" + specialty + ")");
        System.out.println("  Patient: " + patient.getName());
        System.out.println("  [Doctor " + name + " is examining " + patient.getName() + "]");
    }

    // Getters
    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Display patients seen
    public void displayPatients() {
        System.out.println("Doctor: " + name + " (" + doctorId + ")");
        System.out.println("Patients:");
        if (patients.isEmpty()) {
            System.out.println("  No patients assigned.");
        } else {
            for (Patient patient : patients) {
                System.out.println("  " + patient.getName() + " (" + patient.getPatientId() + ")");
            }
        }
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients); // Return a copy for encapsulation
    }
}