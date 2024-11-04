package com.example.lecture020;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}