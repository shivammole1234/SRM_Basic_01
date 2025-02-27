package com.bridgelabz.oops.level3;
class BookDetails {
    // Private attributes for encapsulation
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookDetails() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters to access private fields
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter with validation (example of encapsulation)
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative or zero.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        BookDetails book1 = new BookDetails();
        book1.displayBookInfo();

        // Using parameterized constructor
        BookDetails book2 = new BookDetails("Java Programming", "James Gosling", 499.99);
        book2.displayBookInfo();

        // Modifying price using setter
        book2.setPrice(450.00);
        System.out.println("Updated Price: $" + book2.getPrice());
    }
}
