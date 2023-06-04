package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
        System.out.println("THIS IS ONLY TEST PROJECT. DO NOT CHANGE ANYTHING WITHIN IT!");
    }

}
