package com.tek.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tek.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}