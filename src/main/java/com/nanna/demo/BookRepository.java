package com.nanna.demo;

import java.util.List;

public class BookRepository {


    public List<String> findAllBooks() {
    
        return List.of ( "sapiens" , "harry porter" );
    }
}
