package com.example.system_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SystemDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemDesignApplication.class, args);
    }

    @Bean
    public UndertowServletWebServerFactory embeddedServletContainerFactory() {
//        Thread.sleep();
        return new UndertowServletWebServerFactory();
    }
}
