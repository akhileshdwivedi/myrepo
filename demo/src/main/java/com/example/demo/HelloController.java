package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
       
    @GetMapping("akhilesh")
    public String getDetail(){
        System.out.println("Test success");
        return "Welcome";
    }
}
