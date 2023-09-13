package com.example.petclinicdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String helloWorld() {
        return "Hello, World!";
    }
}
