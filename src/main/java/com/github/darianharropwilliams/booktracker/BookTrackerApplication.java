package com.github.darianharropwilliams.booktracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookTrackerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BookTrackerApplication.class, args);
        System.out.println("ApplicationContext loaded with beans:");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
