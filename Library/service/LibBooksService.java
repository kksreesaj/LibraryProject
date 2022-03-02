package com.learning.emp.service;

import com.learning.emp.model.LibBooksModel;
import com.learning.emp.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LibBooksService {
@Autowired
    private LibraryRepository libraryRepository;
    //Static data

   // List<LibBooksModel> books = new ArrayList<LibBooksModel>(Arrays.asList(
          //  new LibBooksModel("book1", 5, "author1", 2001L, "fiction"),
            //new LibBooksModel("book2", 6, "author1", 2002L, "Mystery"),
   //         new LibBooksModel("book3", 7, "author1", 2003L, "Science fiction"),
     //       new LibBooksModel("book4", 8, "author1", 2004L, "Historical"),
       //     new LibBooksModel("book5", 9, "author1", 2005L, "Romance ")
   // ));

    //add book

    public String addNewBook(LibBooksModel book) {
//
//       this.books.add(book);

        this.libraryRepository.save(book);
        return "added book successfully";
    }

    //fetch all
    public List<LibBooksModel> getAllBooks() {
       // return this.books;
        return this.libraryRepository.findAll();
    }

    //fetch specific book based on id
    // public String getSpecificBook( bookid){
    //  return this.getSpecificBook();
    // }

    //delete book

    public String deleteBook(Long id) {
        //this.books.removeIf(books -> books.getBookid().equals(id));

        this.libraryRepository.deleteById(id);




        return "deleted successfully";
    }

    //update book
    public void updateBooks(Long id, LibBooksModel book) {
        this.libraryRepository.save(book);
       // for (int i = 0; i < this.books.size(); i++) {
         //   LibBooksModel bk = books.get(i);
         //   if (bk.getBookid().equals(id)) {
         //       books.set(i, book);
         //   }
        }
    }








