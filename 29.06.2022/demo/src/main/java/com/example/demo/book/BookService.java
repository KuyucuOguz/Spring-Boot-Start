

package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service layer of the program
 * @version
 *      1.1 04 JULY 2022 @author: 
 *      Oğuz Kuyucu
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    
    public Book get(int id){
        return bookRepository.findById(id).get();
    }

    public Book post(Book book){

        return bookRepository.save(book);
    }

    public Book delete(int id){
        Book book = bookRepository.findById(id).get();
        bookRepository.deleteById(id);
        return book;
        
    }
    public Book put(int id, Book book){
        Book existingBook = bookRepository.findById(id).get();
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPublishmentDate(book.getDateOfPublish());
        return bookRepository.save(existingBook);
    }
    
}
