package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppTestClass {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hell(){
        return "Hello World";
    }
}
