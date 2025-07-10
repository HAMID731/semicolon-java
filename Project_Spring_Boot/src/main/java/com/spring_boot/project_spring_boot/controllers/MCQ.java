package com.spring_boot.project_spring_boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MCQ")
public class MCQ {

    @GetMapping("/AllQuestion")
    public String greeting(){
        return "this are the question";
    }
}
