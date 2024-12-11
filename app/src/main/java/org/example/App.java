package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("A teacher's salary", "Joseph Acheampong", 2024));
        library.addBook(new Book("Data Structures", "Jane Smith", 1949));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Alice", 1);

        // Borrow a book
        patron.borrowBook(new Book("A teacher's salary", "Joseph Acheampong", 2024), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("A teacher's salary", "Joseph Acheampong", 2024), library);

        // Final library state
        System.out.println("\nBooks in the library after operations:");
        library.listBooks();
    }
}
