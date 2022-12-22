package com.nanna.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class LibraryService {
    
    private BookService bookService;
    private BookRepository bookRepository;
    
    @Autowired
    public LibraryService ( BookService bookService , BookRepository bookRepository ) {
        this.bookService    = bookService;
        this.bookRepository = bookRepository;
    }
}
