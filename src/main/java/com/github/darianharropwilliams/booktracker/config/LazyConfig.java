package com.github.darianharropwilliams.booktracker.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.boot.CommandLineRunner;

import com.github.darianharropwilliams.booktracker.service.BookService;
import com.github.darianharropwilliams.booktracker.model.Book;


@Configuration
public class LazyConfig {

    @Bean
    @Lazy
    public CommandLineRunner init(BookService service) {
        return args -> {
            System.out.println("CommandLineRunner triggered — loading books...");
            service.save(new Book(null, "Dune", "Frank Herbert"));
        };
    }
}
