package com.bridgelabz.oops.level3;

class Book {
    // Private attributes for encapsulation
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default to available
    }

    // Getters for accessing book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
            return true;
        } else {
            System.out.println(title + " is currently unavailable.");
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299.99);
        book1.displayBookInfo();

        // Borrowing the book
        book1.borrowBook();
        book1.displayBookInfo();

        // Trying to borrow again
        book1.borrowBook();
        book1.borrowBook();

        // Returning the book
        book1.returnBook();
        book1.displayBookInfo();
    }
}
