package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }
}

@RestController   // 🔴 VERY IMPORTANT
class HelloController {

    @GetMapping("/")   // this means: localhost:8080
    public String home() {
        return "Hello Krishna, your Spring app is working!";
    }
}
	