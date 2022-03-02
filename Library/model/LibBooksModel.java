package com.learning.emp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LibBooksModel {
    @Id
    private String bookname;
    private Integer bookprice;
    private String bookauthor;
    private Long bookid;
    private String category;

   // public LibBooksModel(String bookname, Integer bookprice, String bookauthor, Long bookid, String category) {
     //   this.bookname = bookname;
       // this.bookprice = bookprice;
    //    //this.bookauthor = bookauthor;
      //  this.bookid = bookid;
        //this.category = category;
    //}
   // public LibBooksModel(){

    //}



    //public String getBookname() {
      //  return bookname;
    //}

    //public void setBookname(String bookname) {
      //  this.bookname = bookname;
    //}

    //public Integer getBookprice() {
      //  return bookprice;
    //}

    //public void setBookprice(Integer bookprice) {
      //  this.bookprice = bookprice;
    //}

    //public String getBookauthor() {
      //  return bookauthor;
    //}

    //public void setBookauthor(String bookauthor) {
      //  this.bookauthor = bookauthor;
    //}

    //public Long getBookid() {
      //  return bookid;
    //}

    //public void setBookid(Long bookid) {
    //    this.bookid = bookid;
    //}

    //public String getCategory() {
      //  return category;
    //}

    //public void setCategory(String category) {
      //  this.category = category;
    //}


}
