package com.nanna.demo;

public class BookService {

            public String  findAuthor( final String bookName ){
                
                if(bookName == "harry porter") {
                    return "harry P Writer ";
                }
                if(bookName =="sapiens") {
                    return "sapiens Writer ";
                }
    
                return " ";
                
            }

}
