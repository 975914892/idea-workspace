package com.example.springdemo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hellow(){

        return "hello word!";
    }

}
