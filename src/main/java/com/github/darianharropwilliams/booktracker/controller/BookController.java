package com.github.darianharropwilliams.booktracker.controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.github.darianharropwilliams.booktracker.model.Book;
import com.github.darianharropwilliams.booktracker.service.BookService;



@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.delete(id);
    }
}
