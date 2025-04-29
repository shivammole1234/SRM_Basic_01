package com.bridgelabz.SingleInheritance.LibraryManagement;

// Main class to test Book and Author
public class Main {
    public static void main(String[] args) {
        // Creating an Author object (which is also a Book)
        Author book1 = new Author("Wings of Fire", 1999, "Dr. A.P.J. Abdul Kalam",
                "An Indian aerospace scientist and former President of India.");

        Author book2 = new Author("The Guide", 1958, "R.K. Narayan",
                "Famous Indian writer known for his Malgudi Days stories.");

        // Displaying details
        System.out.println("🔹 Book Details:");
        book1.displayInfo();
        System.out.println("\n------------------------\n");
        book2.displayInfo();
    }
}
