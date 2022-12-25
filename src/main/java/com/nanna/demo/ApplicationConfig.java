package com.nanna.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//config class
@Configuration
public class ApplicationConfig {
    
    
//    declaring bean
    @Bean
    public  BookRepository bookRepository () {
        return new BookRepository ();
    }
    @Bean
    public  BookService bookService() {
        return new BookService ();
    }
}
