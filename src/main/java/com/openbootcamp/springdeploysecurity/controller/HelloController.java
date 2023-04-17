package com.openbootcamp.springdeploysecurity.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    private String message;

    @Value("${app.test}")
    private String test;

    @GetMapping("/hello")
    private String hello(){
        System.out.println(message);
        System.out.println(test);
        return "Hello from public method";
    }


    @GetMapping("/security/hello")
    private String helloSecurity(){
        return "Hello from a security hello method";
    }

}
