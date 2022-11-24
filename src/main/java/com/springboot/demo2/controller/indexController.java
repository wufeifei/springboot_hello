package com.springboot.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class indexController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
