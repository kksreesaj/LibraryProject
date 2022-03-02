package com.learning.emp.controller;

import com.learning.emp.model.LibBooksModel;
import com.learning.emp.service.LibBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class LibBooksController {
    @Autowired
    private LibBooksService booksService;

    //get all books
    @GetMapping(value = "/all")
    public List<LibBooksModel> getAll() {
        return this.booksService.getAllBooks();
    }

    // get specific book
    // @GetMapping(value ="/specify")
    //public List<LibBooksModel> getThis(){
    // return this.booksService.getSpecificBook(bookid) ;
    //}

    //add book
    @PostMapping(value = "/add")
    public String addNewBook(@RequestBody LibBooksModel book) {
        return this.booksService.addNewBook(book);
    }

    //delete book
    @DeleteMapping(value ="/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        return this.booksService.deleteBook(id);
    }
    //update book
    @PutMapping(value="/update/{id}")
    public String updateData(@PathVariable Long id,@RequestBody LibBooksModel book){
        this.booksService.updateBooks(id,book);
        return "updated successfully";
    }
}