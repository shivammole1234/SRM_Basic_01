package interviewDurgesh.inheritance.animal;

// Main.java
public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("tioo", 2);
        Bird bird = new Bird("Kioo", 1);

        // Polymorphism using an array of Animal type
        Animal[] animals = {dog, cat, bird};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}