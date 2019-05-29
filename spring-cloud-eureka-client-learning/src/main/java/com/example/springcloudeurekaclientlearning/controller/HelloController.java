package com.example.springcloudeurekaclientlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class HelloController {

    @GetMapping("say")
    public String sayHello(){
        return "hello";
    }
}
