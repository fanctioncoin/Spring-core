package com.staravoyt.spring.core.config;

import com.staravoyt.spring.core.model.Book;
import com.staravoyt.spring.core.model.Magazine;
import com.staravoyt.spring.core.model.Newspaper;
import com.staravoyt.spring.core.model.Shop;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@PropertySource({"classpath:books.properties","classpath:magazines.properties","classpath:newspapers.properties"})
public class JavaBasedConfigProperties {
    //Для примера оставил себе что возможно и сюда Value выносить.
    @Value("${humorBook.id}")
    private Integer humorBookId;

    @Bean
    public Shop shopIrish(List<Book> booksIrish,List<Magazine> magazinesIrish,List<Newspaper> newspapersIrish){
        Shop shopIrish = new Shop(1,"Irish bookstore",null,null,null);
        shopIrish.setBooks(booksIrish);
        shopIrish.setMagazines(magazinesIrish);
        shopIrish.setNewspapers(newspapersIrish);

        return shopIrish;
    }
    @Bean
    public List<Book> booksIrish(Book humorBook, Book romansBook){
        List<Book> booksIrish =new ArrayList<>();
        booksIrish.add(humorBook);
        booksIrish.add(romansBook);
        return booksIrish;
    }

    @Bean
    public List<Magazine> magazinesIrish(Magazine gqMagazine, Magazine elisMagazine){
        List<Magazine> magazinesIrish =new ArrayList<>();
        magazinesIrish.add(gqMagazine);
        magazinesIrish.add(elisMagazine);
        return magazinesIrish;
    }
    @Bean
    public List<Newspaper> newspapersIrish(Newspaper newYorkTimes, Newspaper dailyNews){
        List<Newspaper> newspapersIrish =new ArrayList<>();
        newspapersIrish.add(newYorkTimes);
        newspapersIrish.add(dailyNews);
        return newspapersIrish;
    }

    @Bean
    public Book humorBook(@Value("${humorBook.name}") String name,
                          @Value("${humorBook.description}") String description,
                          @Value("${humorBook.price}") int price,
                          @Value("${humorBook.binding}") String binding){
      Book humorBook =new Book(humorBookId,name, description, price, binding);
    return humorBook;
    }

    @Bean
    public Book romansBook(@Value("${romansBook.id}") int id,
                           @Value("${romansBook.name}") String name,
                           @Value("${romansBook.description}") String description,
                           @Value("${romansBook.price}") int price,
                           @Value("${romansBook.binding}") String binding) {
        Book romansBook = new Book(id, name, description, price, binding);
        return romansBook;
    }

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
    public Magazine gqMagazine(@Value("${gqMagazine.id}") int id,
                               @Value("${gqMagazine.name}") String name,
                               @Value("${gqMagazine.description}") String description,
                               @Value("${gqMagazine.price}") int price,
                               @Value("${gqMagazine.listOfSensation}") List<String> listOfSensation) {
        Magazine gqMagazine = new Magazine(id, name, description, price,listOfSensation);
        return gqMagazine;
    }

        @Bean
    public Magazine elisMagazine(@Value("${elisMagazine.id}") int id,
                                 @Value("${elisMagazine.name}") String name,
                                 @Value("${elisMagazine.description}") String description,
                                 @Value("${elisMagazine.price}") int price,
                                 @Value("${elisMagazine.listOfSensation}") List<String> listOfSensation) {
        Magazine elisMagazine =  new Magazine(id, name, description, price,listOfSensation);
        return elisMagazine;
    }


    @Bean
    public Newspaper newYorkTimes(@Value("${newYorkTimes.id}") int id,
                                  @Value("${newYorkTimes.name}") String name,
                                  @Value("${newYorkTimes.description}") String description,
                                  @Value("${newYorkTimes.price}") int price,
                                  @Value("#{${newYorkTimes.authorMap}}") Map<String, Integer> authorMap) {
        Newspaper newYorkTimes = new Newspaper(id, name, description, price, authorMap);
        return newYorkTimes;
    }

    @Bean
    public Newspaper dailyNews(@Value("${dailyNews.id}") int id,
                               @Value("${dailyNews.name}") String name,
                               @Value("${dailyNews.description}") String description,
                               @Value("${dailyNews.price}") int price,
                               @Value("#{${dailyNews.authorMap}}") Map<String, Integer> authorMap) {
        Newspaper dailyNews = new Newspaper(id, name, description, price, authorMap);
        return dailyNews;
    }

}
