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

    public boolean borrowBook(String memberId, String bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member != null && book != null && book.getAvailableCopies() > 0) {
            book.borrowBook();
            member.borrowBook(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(String memberId, String bookId) {
        Member member = findMemberById(memberId);
        Book book = findBookById(bookId);

        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
            book.returnBook();
            member.returnBook(book);
            return true;
        }
        return false;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }






}
