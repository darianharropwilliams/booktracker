package com.github.darianharropwilliams.booktracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.darianharropwilliams.booktracker.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
