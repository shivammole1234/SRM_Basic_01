package com.bridgelabz.oops.level3;

public class PersionDetails {

    public String name;
    public int age;
    public PersionDetails(String name,int age){
        this.age=age;
        this.name=name;
    }

    public PersionDetails(PersionDetails otherPerson){
        this.name=otherPerson.name;
        this.age=otherPerson.age;
    }

    public void printPersonDetails(){
        System.out.println("name:"+this.name+" "+"Age"+this.age);
    }

    public static void main(String[] args) {
        PersionDetails person=new PersionDetails("Raj",23);
        person.printPersonDetails();

        PersionDetails person1=new PersionDetails(person);
        person1.printPersonDetails();
    }

}
