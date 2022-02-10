package com.staravoyt.spring.core.config;

import com.staravoyt.spring.core.config.individual.BooksConfig;
import com.staravoyt.spring.core.config.individual.MagazinesConfig;
import com.staravoyt.spring.core.config.individual.NewspaperConfig;
import com.staravoyt.spring.core.model.Book;
import com.staravoyt.spring.core.model.Minimarket;
import com.staravoyt.spring.core.model.Newspaper;
import com.staravoyt.spring.core.model.Supermarket;
import com.staravoyt.spring.core.qualifiers.NewYorkTimesQualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BooksConfig.class, MagazinesConfig.class, NewspaperConfig.class})
public class JavaBasedConfigPropertiesAutowiringScanComponent {

//    @Bean
//    public Supermarket supermarket(@Qualifier("romansBook") Book book){
//        Supermarket supermarket =new Supermarket(2,"Guss",null);
//        supermarket.setBook(book);
//        return supermarket;
//    }
//    @Bean
////    public Minimarket minimarket(@CustomStringQualifier(name = "daily") Newspaper newspaper){
//        public Minimarket minimarket(@NewYorkTimesQualifier Newspaper newspaper){
//        Minimarket minimarket =new Minimarket(3,"Irina",null);
//        minimarket.setNewspaper(newspaper);
//        return minimarket;
//    }
}
