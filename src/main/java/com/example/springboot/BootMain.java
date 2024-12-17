package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootMain {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BootMain.class, args);
    }
}
