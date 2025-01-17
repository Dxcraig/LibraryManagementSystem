package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public ArrayList<Book> searchBooks(String query) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean isBookAvailable(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId) && book.getAvailableCopies() > 0) {
                return true;
            }
        }
        return false;
    }




}
