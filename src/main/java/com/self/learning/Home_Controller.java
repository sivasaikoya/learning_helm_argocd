package com.self.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_Controller {
    @GetMapping("/home")
    public String home(){
        return "Welcome Home";
    }
    @GetMapping("/about")
    public String about(){
        return "Welcome About";
    }
}
