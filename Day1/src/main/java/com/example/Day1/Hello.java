package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "This is the First line";
    }
    @GetMapping("/second")
    public String second(){
        return "Currently, I am learning SpringBoot";
    }
    @GetMapping("/third")
    public String third(){
        return "And I am making this for my attendance";
    }
}
