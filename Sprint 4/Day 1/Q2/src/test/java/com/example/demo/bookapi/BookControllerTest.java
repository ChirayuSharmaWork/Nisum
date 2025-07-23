package com.example.bookapi;

import com.example.bookapi.controller.BookController;
import com.example.bookapi.model.Book;
import com.example.bookapi.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookRepository repo;

    @Test
    void testGetAllBooks() throws Exception {
        given(repo.findAll()).willReturn(List.of(new Book(1L, "Java", "Author", 2020)));

        mockMvc.perform(get("/api/books").header("Authorization", "Bearer demo-jwt-token"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Java"));
    }
}
