package com.bridgelabz.oops.library;
public class Book {

    private static String libraryName = "City Library"; // Static variable
    private final String isbn; // Final variable (cannot be changed)
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }

    }

    public static void displayLibraryName(){
        System.out.println("Library Name Is :- "+libraryName);
    }
}
