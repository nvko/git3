package com.example.git3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping
    public String getHola() {
        return "Hola!";
    }
}
