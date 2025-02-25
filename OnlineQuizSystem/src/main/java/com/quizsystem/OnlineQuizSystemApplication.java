package com.quizsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineQuizSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineQuizSystemApplication.class, args);
        System.out.println("Online Quiz System Backend Running Successfully!");
    }
}
