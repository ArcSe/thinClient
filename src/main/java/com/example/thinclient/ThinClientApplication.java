package com.example.thinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.thinclient.repository")
public class ThinClientApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ThinClientApplication.class, args);
    }

}
