package com.example.atvci;

import org.springframework.web.bind.annotation.GetMapping;

public class Teste01 {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
