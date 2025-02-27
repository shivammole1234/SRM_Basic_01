package com.bridgelabz.objectorienteddesign.Library;

// this is aggregation relationship between Library and Book classes.
// here Library has a list of books. So we can say that Library has a list of Books.
// Here Library is the whole and Book is the part.
// This means that if Library object is destroyed then all its books will also be destroyed.
// But if any one of the book objects are destroyed then it won't affect the Library object.
// This is called as Aggregation Relationship.
public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Code With Harry","Harry");
        Library library1=new Library("My Library");
        library1.addBook(book1);
        library1.displayBooks();

        Book book2=new Book("Java Programming","Hitesh Choudhary");
        library1.addBook(book2);
        library1.displayBooks();
        library1.getBooks().get(0).setTitle("Python Programming");
        System.out.println("Updated Title: "+library1.getBooks().get(0).getTitle());
        library1.displayBooks();

    }
}
