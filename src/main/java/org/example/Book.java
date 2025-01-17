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
