package com.example.demo.Book;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "book_table")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private LocalDate dateOfPublish;
    private String author;
    private String name;
    
    //@Id
    //@SequenceGenerator(
       //name = "book_sequence",
       //sequenceName = "book_sequence",
       // allocationSize = 1
    //)
    
    public Book() {
        //id = 1;
    }

    public Book(LocalDate dateOfPublish, String author, String name) {
        this.dateOfPublish = dateOfPublish;
        this.author = author;
        this.name = name;
    }

    public Book(int id, LocalDate dateOfPublish, String author, String name){
        this.id = id;
        this.dateOfPublish = dateOfPublish;
        this.author = author;
        this.name = name;
    }
    
    //public Book(LocalDate dateOfPublish, String author, String name){
    //    this.dateOfPublish = dateOfPublish;
    //    this.author = author;
    //    this.name = name;
    //    id = 5;
    //}
    @Override
    public String toString(){
        return  "Book id:" + id + " name:" + name + " author:" + author + " date of publish:" + dateOfPublish;
    }
    public int getId(){
        return id;
    }
    public LocalDate getDateOfPublish(){
        return dateOfPublish;
    }
    public String getAuthor(){
        return author;
    }
    public String getName(){
        return name;
    }

    public void setId(int newId){
        id = newId;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }
    public void setPublishmentDate(LocalDate newPublishmentDate){
        dateOfPublish = newPublishmentDate;
    }
    public void setName(String newName){
        name = newName;
    }
}
