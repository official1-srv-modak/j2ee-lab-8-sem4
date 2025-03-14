package com.BookManage.service;

import com.BookManage.model.Book;

import java.util.List;

public interface BookServiceLocal {
    void addBook(String isbn, String title, String author, double price);
    List<Book> listBooks();
}