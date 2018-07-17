package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
       
    @GetMapping("akhilesh")
    public String getDetail(){
        System.out.println("Master commit test");
        System.out.println("Master commit conflict");
        System.out.println("Master commit merge");
        return "Welcome";
    }
}
