package org.example;

import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
