package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World Test RESTful with Spring Boot";
    }

}
