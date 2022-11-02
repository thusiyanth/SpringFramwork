package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private transient Integer val = 0;

    @GetMapping(value = "/")
    public String getValue() {

        val++;

        String result = "Hello-World-" +"  "+ val;
        return result;
    }


}
