package org.example.api.models;

import java.util.List;

public class AllBooksModal {

    private List<BookModel> books;

    public List<BookModel> getBooks() {
        return books;
    }

    public void setBooks(List<BookModel> books) {
        this.books = books;
    }
}
