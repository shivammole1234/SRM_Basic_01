package com.bridgelabz.objectorienteddesign.hospital;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String patientId;
    private String name;
    private List<Doctor> doctors; // Association with Doctor

    public Patient(String patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Add a doctor to patient's list (maintains association)
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Remove a doctor from patient's list
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    // Display doctors consulted
    public void displayDoctors() {
        System.out.println("Patient: " + name + " (" + patientId + ")");
        System.out.println("Consulted Doctors:");
        if (doctors.isEmpty()) {
            System.out.println("  No doctors consulted.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println("  " + doctor.getName() + " (" + doctor.getDoctorId() + ")");
            }
        }
    }

    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors); // Return a copy for encapsulation
    }
}