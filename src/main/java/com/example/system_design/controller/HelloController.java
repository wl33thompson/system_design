package com.example.system_design.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    String hello(){
//        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "hello world!";
    }

    @GetMapping("/hello2")
    Integer hello2(){
        return 0;
    }
}
