package com.khun.testcasehelper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/v1/hello")
    public String home() {
        System.out.println("Hello World");
        return "Hello World!";
    }
}
