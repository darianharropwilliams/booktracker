package com.github.darianharropwilliams.booktracker.service;


import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Lazy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.darianharropwilliams.booktracker.model.Book;
import com.github.darianharropwilliams.booktracker.repository.BookRepository;



@Service
@Lazy // Demonstrating lazy loading
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
        System.out.println("BookService initialized (lazy)");
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book save(Book book) {
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
