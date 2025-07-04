package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookName(int id) {
        String bookName = bookRepository.getBookName(id);
        System.out.println("Retrieved Book: " + bookName);
    }
}
