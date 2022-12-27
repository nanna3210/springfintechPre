package com.nanna.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {
    
    private BookRepository bookRepository;
    private BookService bookService;

//    constructor dependency injection
    @Autowired
    public LibraryService ( BookRepository bookRepository , BookService bookService ) {
        this.bookRepository = bookRepository;
        this.bookService    = bookService;
    }
}
