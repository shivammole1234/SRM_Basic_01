package com.bridgelabz.objectorienteddesign.universityfaculty;

public class Faculty {
    private String name;
    private String facultyId;
    private String specialization;

    public Faculty(String name, String facultyId, String specialization) {
        this.name = name;
        this.facultyId = facultyId;
        this.specialization = specialization;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return String.format("Faculty: %s (ID: %s), Specialization: %s",
                name, facultyId, specialization);
    }
}