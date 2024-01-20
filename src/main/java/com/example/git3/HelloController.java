package com.example.git3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World";
    }

}
