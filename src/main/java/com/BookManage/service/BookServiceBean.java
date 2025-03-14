package com.BookManage.service;
import com.BookManage.model.Book;
import jakarta.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Stateless
public class BookServiceBean implements BookServiceLocal {
    private final ConcurrentMap<String, Book> books = new ConcurrentHashMap<>();

    @Override
    public void addBook(String isbn, String title, String author, double price) {
        books.put(isbn, new Book(isbn, title, author, price));
    }

    @Override
    public List<Book> listBooks() {
        return new ArrayList<>(books.values());
    }
}