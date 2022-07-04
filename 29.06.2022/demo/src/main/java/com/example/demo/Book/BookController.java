package com.example.demo.Book;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Book.BookService;

@RestController
@RequestMapping("api/v1/Book")
public class BookController {
    
    @Autowired
    private BookService service;

    /* 
    public ArrayList<Book> getList(){
        return service.getBooks();
    }
    */
    //public String hello(){
    //    return "Hello";
    //}

    @GetMapping
    public String get(int id){
        service.get(id);
        return " \n Hello World";
    }
    @PostMapping
    public String post(int year, String month, int day, String author, String name){
        Month mo = Month.JANUARY;
        if(month.equals("JANUARY")){
            mo = Month.JANUARY;
        }
        if(month.equals("FEBUARY")){
            mo = Month.FEBRUARY;
        }
        if(month.equals("MARCH")){
            mo = Month.MARCH;
        }
        if(month.equals("APRİL")){
            mo = Month.APRIL;
        }
        if(month.equals("MAY")){
            mo = Month.MAY;
        }
        if(month.equals("JUNE")){
            mo = Month.JUNE;
        }
        if(month.equals("JULY")){
            mo = Month.JULY;
        }
        if(month.equals("AUGUST")){
            mo = Month.AUGUST;
        }
        if(month.equals("SEPTEMBER")){
            mo = Month.SEPTEMBER;
        }
        if(month.equals("OCTOBER")){
            mo = Month.OCTOBER;
        }
        if(month.equals("NOVEMBER")){
            mo = Month.NOVEMBER;
        }
        if(month.equals("DECEMBER")){
            mo = Month.DECEMBER;
        }

        Book book = new Book(LocalDate.of(year, mo, day), author, name);

        service.post(book);
        return " \n HelloWorld";
    }
    @DeleteMapping
    public String delete(int id){
        service.delete(id);
        return " \n HelloWorld";
    }
    @PutMapping
    public String put( int id,int year, String month, int day, String author, String name){
        Month mo = Month.JANUARY;

        if(month.equals("JANUARY")){
            mo = Month.JANUARY;
        }
        if(month.equals("FEBU")){
            mo = Month.FEBRUARY;
        }
        if(month.equals("MARCH")){
            mo = Month.MARCH;
        }
        if(month.equals("APRİL")){
            mo = Month.APRIL;
        }
        if(month.equals("MAY")){
            mo = Month.MAY;
        }
        if(month.equals("JUNE")){
            mo = Month.JUNE;
        }
        if(month.equals("JULY")){
            mo = Month.JULY;
        }
        if(month.equals("AUGUST")){
            mo = Month.AUGUST;
        }
        if(month.equals("SEPTEMBER")){
            mo = Month.SEPTEMBER;
        }
        if(month.equals("OCTOBER")){
            mo = Month.OCTOBER;
        }
        if(month.equals("NOVEMBER")){
            mo = Month.NOVEMBER;
        }
        if(month.equals("DECEMBER")){
            mo = Month.DECEMBER;
        }

        
        Book book = new Book(LocalDate.of(year, mo, day), author, name);
        
        
        service.put(id, book);
        return " \n HelloWorld";
    }
}
