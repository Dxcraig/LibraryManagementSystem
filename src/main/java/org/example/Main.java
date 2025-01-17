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

        // Display all books and their availability
        System.out.println("Books in the library:");
        library.displayAllBooks();


    }
}