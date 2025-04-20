package com.spring_boot.project_spring_boot.controllers;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example {

    @RequestMapping("/greet")
    public String greeting(){
        return "Greetings from Spring Boot!";
    }
}
