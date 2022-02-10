package com.staravoyt.spring.core.config.individual;

import com.staravoyt.spring.core.model.*;
import com.staravoyt.spring.core.qualifiers.CustomStringQualifier;
import com.staravoyt.spring.core.qualifiers.NewYorkTimesQualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@PropertySource({"classpath:books.properties"})
public class BooksConfig {


    @Bean
    public Book romansBook(@Value("${romansBook.id}") int id,
                           @Value("${romansBook.name}") String name,
                           @Value("${romansBook.description}") String description,
                           @Value("${romansBook.price}") int price,
                           @Value("${romansBook.binding}") String binding) {
        Book romansBook = new Book(id, name, description, price, binding);
        return romansBook;
    }
    @CustomStringQualifier(name="detective")
    @Bean
    public Book detectiveBook(@Value("${detectiveBook.id}") int id,
                              @Value("${detectiveBook.name}") String name,
                              @Value("${detectiveBook.description}") String description,
                              @Value("${detectiveBook.price}") int price,
                              @Value("${detectiveBook.binding}") String binding) {
        Book detectiveBook = new Book(id, name, description, price, binding);
        return detectiveBook;
    }

    @Bean
    public Book humorBook(@Value("${humorBook.id}") int id,
                          @Value("${humorBook.name}") String name,
                          @Value("${humorBook.description}") String description,
                          @Value("${humorBook.price}") int price,
                          @Value("${humorBook.binding}") String binding){
        Book humorBook =new Book(id,name, description, price, binding);
        return humorBook;
    }
}
