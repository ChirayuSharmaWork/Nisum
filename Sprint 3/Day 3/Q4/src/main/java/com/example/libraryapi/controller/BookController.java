package com.example.libraryapi.controller;

import com.example.libraryapi.model.Book;
import com.example.libraryapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAll(@RequestParam(required = false) String author,
                             @RequestParam(required = false) Integer publishedYear) {
        return service.getAll(author, publishedYear);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return service.add(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable int id, @RequestBody Book book) {
        return service.update(id, book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}