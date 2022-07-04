package com.example.demo.Book;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


import com.example.demo.Book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class BookService {

    //private ArrayList<Book> books;
   

    @Autowired
    private BookRepository bookRepository;
    
    
    

    /*@Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    */    
 


    /*public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public BookService(){
        bookRepository = null;
    }
    */


    /*
    public ArrayList<Book> getBooks(){
        LocalDate date = LocalDate.of(1861, Month.JANUARY, 1);
        books.add(new Book(1, date, "Dostoyevski", "Ezilmiş ve Aşağılanmışlar"));
        return books;
    }
    public Book get(int id){
        for(int i = 0; i < books.size(); i++){
            if(id == books.get(i).getId()){
                return books.get(i);
            }
        }
        return null;
    }

    public void post(Book book){

        books.add(book);
    }

    public boolean delete(int id){

        for(int i = 0; i < books.size(); i++){
            if(id == books.get(i).getId()){
                books.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean put(int id, Book book){
        for(int i = 0; i < books.size(); i++){
            if(id == books.get(i).getId()){
                books.set(i, book);
                return true;
            }
        }
        return false;
    }
    */
    public Book get(int id){
        return bookRepository.findById(id).get();
    }

    public void post(Book book){

        bookRepository.save(book);
    }

    public void delete(int id){
        bookRepository.deleteById(id);
    }
    public void put(int id, Book book){
        Book existingBook = bookRepository.findById(id).get();
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPublishmentDate(book.getDateOfPublish());
        bookRepository.save(existingBook);
    }
    
}
