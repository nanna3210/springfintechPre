package com.nanna.demo;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {
    
    
    public BookRepository ( ) {
        System.out.println ("book repository object created ");
    }
}
