package com.BookManage.controller;

import com.BookManage.model.Book;
import com.BookManage.service.BookServiceLocal;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class BookManager {

    @Inject
    private BookServiceLocal bookService; // CDI-based injection

    @PostConstruct
    public void init() {
        System.out.println("BookManager initialized");
    }

    public void addBook(Book book) {
        if (bookService != null) {
            bookService.addBook(book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPrice());
        } else {
            System.err.println("BookService is not available.");
        }
    }

    public List<Book> getBooks() {
        return bookService.listBooks();
    }
}
