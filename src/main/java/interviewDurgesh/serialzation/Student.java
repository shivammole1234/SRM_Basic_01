package interviewDurgesh.serialzation;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;

    transient private String email; // it will save variable from being serialize
    private int age;

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayName(){
        System.out.println("my name is :- "+name);
    }
}
