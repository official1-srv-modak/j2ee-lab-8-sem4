package com.BookManage.controller;
import com.BookManage.model.Book;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Inject
    private BookManager bookManager;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String method = req.getParameter("method");
        String isbn = req.getParameter("isbn");
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        double price = Double.parseDouble(req.getParameter("price"));

        Book book = new Book(isbn, title, author, price);

        if ("cdi".equals(method)) {
            bookManager.addBook(book);
        } else {
            bookManager.addBook(book);
        }

        resp.sendRedirect("book?action=list");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if ("list".equals(action)) {
            req.setAttribute("books", bookManager.getBooks());
            req.getRequestDispatcher("listBooks.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("addBook.jsp").forward(req, resp);
        }
    }
}