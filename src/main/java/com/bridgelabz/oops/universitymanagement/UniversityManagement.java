package com.bridgelabz.oops.universitymanagement;

public class UniversityManagement {

    public static void main(String[] args) {
        Student stu1 = new Student(101, "Aman", "A");
        Student stu2 = new Student(102, "Adarsh", "B");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
    }

}
