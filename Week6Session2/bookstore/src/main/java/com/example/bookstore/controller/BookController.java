package com.example.bookstore.controller;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //get all books
    @GetMapping
    public List<BookDTO> getBooks(){
        return bookService.getAllBooks();
    }
    // get books by author

    // create a new book




}
