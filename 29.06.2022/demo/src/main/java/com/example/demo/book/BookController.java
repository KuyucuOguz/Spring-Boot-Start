package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Apı layer of program
 * @version
 *      1.1 04 JULY 2022 @author: 
 *      Oğuz Kuyucu
 */
@RestController
@RequestMapping("api/v1/Book") //url
public class BookController {
    
    @Autowired
    private BookService service;

    @GetMapping
    public Book get(int id){
        return service.get(id);
    }
   
    @PostMapping
    public Book post(@RequestBody Book book){
        return service.post(book);
    }

    @DeleteMapping
    public Book delete(int id){
        return service.delete(id);
    }
    
    @PutMapping
    public Book put(int id, @RequestBody Book book){
        return service.put(id, book);
    }
}
