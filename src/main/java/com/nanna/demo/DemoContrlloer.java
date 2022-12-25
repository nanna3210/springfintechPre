package com.nanna.demo;

import org.springframework.beans.PropertyAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoContrlloer {
    
//    controller class
    private static  String SENTENCE = "Hello World ";
    private final String propertySentence;
    
    @Autowired
    public DemoContrlloer ( @Value ( "${demo.sentence}" ) String propertySentence) {
    
        this.propertySentence = propertySentence;
    
    }
    
    @RequestMapping (value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return SENTENCE;
    }
    
    @RequestMapping(value = "property/sentence", method = RequestMethod.GET)
    public String helloFromProperty() {
    
    
        return propertySentence;
    }
    
    @RequestMapping(value = "update/sentence", method = RequestMethod.POST)
    public  void  updateString(@RequestBody String updatedSentence ) {
    
        SENTENCE = updatedSentence;
    
    
    }

}
