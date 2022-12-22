package com.nanna.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContrlloer {
    
    
    private static  String SENTENCE = "Hello World ";
    
    
    @RequestMapping (value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return SENTENCE;
    }
    
    @RequestMapping(value = "update/sentence", method = RequestMethod.POST)
    public  void  updateString(@RequestBody String updatedSentence ) {
    
        SENTENCE = updatedSentence;
    
    
    }

}
