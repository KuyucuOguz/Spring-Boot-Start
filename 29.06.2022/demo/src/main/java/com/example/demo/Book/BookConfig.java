
package com.example.demo.Book;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;

import com.example.demo.Book.BookRepository;

@Configuration
public class BookConfig extends AbstractJdbcConfiguration{
    @Bean
    
    CommandLineRunner commandLineRunner(BookRepository bookrepository){
        return args-> {
            
            bookrepository.save(new Book( LocalDate.of(1989, Month.JANUARY, 1), "Dostoyevski", "Ezilmiş ve Aşağılanmışlar"));
        };
   

    }
    
}
