package com.bridgelabz.objectorienteddesign.hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add doctor to hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Add patient to hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Getters
    public Doctor getDoctor(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return doctor;
            }
        }
        return null;
    }

    public Patient getPatient(String patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        return null;
    }

    // Display hospital structure
    public void displayStructure() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        if (doctors.isEmpty()) {
            System.out.println("  No doctors.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println("  " + doctor.getName() + " (" + doctor.getDoctorId() + ")");
            }
        }
        System.out.println("Patients:");
        if (patients.isEmpty()) {
            System.out.println("  No patients.");
        } else {
            for (Patient patient : patients) {
                System.out.println("  " + patient.getName() + " (" + patient.getPatientId() + ")");
            }
        }
    }
}