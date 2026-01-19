package com.example.day2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String home(){
        return "Home";
    }
    @GetMapping("About.html")
    public String About(){
        return "About";
    }
    @GetMapping("Contact.HTML")
    public String Contact(){
        return "Contact";
    }

}
