package com.nisum.chapter3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @RequestMapping("/HelloWorld")
    @ResponseBody
    public String sayHelloWorld(){
        return "Hello World!";
    }
}
