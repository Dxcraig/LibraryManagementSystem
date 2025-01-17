package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("1", "Book One", 3));
        library.addBook(new Book("2", "Book Two", 2));
        library.addBook(new Book("3", "Book Three", 1));
        library.addBook(new Book("4", "Book Four", 4));
        library.addBook(new Book("5", "Book Five", 5));

        // Adding members to the library
        library.addMember(new Member("1", "Member One"));
        library.addMember(new Member("2", "Member Two"));
        library.addMember(new Member("3", "Member Three"));

        // Simulating borrowing books
        System.out.println("Borrowing Book One by Member One: " + library.borrowBook("1", "1"));
        System.out.println("Borrowing Book Two by Member Two: " + library.borrowBook("2", "2"));
        System.out.println("Borrowing Book Three by Member Three: " + library.borrowBook("3", "3"));

        // Display all books and their availability
        System.out.println("\nBooks after borrowing:");
        library.displayAllBooks();

        // Simulating returning books
        System.out.println("\nReturning Book One by Member One: " + library.returnBook("1", "1"));
        System.out.println("Returning Book Two by Member Two: " + library.returnBook("2", "2"));
        System.out.println("Returning Book Three by Member Three: " + library.returnBook("3", "3"));

        // Display all books and their availability
        System.out.println("\nBooks after returning:");
        library.displayAllBooks();
    }
}