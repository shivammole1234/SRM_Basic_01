package com.bridgelabz.oops.level2;
public class Student {

    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade(double marks){

        if(marks >= 90 && marks <= 100){
            return "A";
        }else if (marks >= 80 && marks < 90){
            return "B";
        } else if (marks >= 70 && marks < 80) {
            return "C";
        } else if (marks >= 60 && marks < 70) {
            return "D";
        } else{
            return "F";
        }
    }

    public void displayDetails(){
        System.out.println("**********Student Details***********");
        System.out.println("Student Name:- "+name);
        System.out.println("Roll Number:- "+rollNumber);
        System.out.println("Marks:- "+marks);
        System.out.println("Grade:- "+calculateGrade(marks));
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Student student=new Student("Rahul",123,95.0);
        student.displayDetails();


    }
}
