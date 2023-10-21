package com.example.system_design.ddddemo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("/hello")
    String hello(){
//        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10*60*000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "hello world!";
    }
}
