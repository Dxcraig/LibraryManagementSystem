package org.example;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int availableCopies;

    public Book(String bookId, String title, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            throw new IllegalStateException("No available copies of this book");
        }
    }
    public void returnBook() {
        availableCopies++;
    }


}
