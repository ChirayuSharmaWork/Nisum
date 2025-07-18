package com.example.libraryapi.service;

import com.example.libraryapi.model.Book;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final Map<Integer, Book> bookRepo = new HashMap<>();

    public List<Book> getAll(String author, Integer year) {
        return bookRepo.values().stream()
                .filter(b -> (author == null || b.getAuthor().equalsIgnoreCase(author)))
                .filter(b -> (year == null || b.getPublishedYear() == year))
                .collect(Collectors.toList());
    }

    public Book getById(int id) {
        return bookRepo.get(id);
    }

    public Book add(Book book) {
        bookRepo.put(book.getId(), book);
        return book;
    }

    public Book update(int id, Book book) {
        bookRepo.put(id, book);
        return book;
    }

    public void delete(int id) {
        bookRepo.remove(id);
    }
}