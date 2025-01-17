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


}
