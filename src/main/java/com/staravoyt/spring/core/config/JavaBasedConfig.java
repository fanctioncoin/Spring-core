package com.staravoyt.spring.core.config;

import com.staravoyt.spring.core.model.Book;
import com.staravoyt.spring.core.model.Magazine;
import com.staravoyt.spring.core.model.Newspaper;
import com.staravoyt.spring.core.model.Shop;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaBasedConfig {

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
    public Book humorBook(){
      Book humorBook =new Book(1,"Comedy Club","humor of book",100,"hard");
    return humorBook;
    }

    @Bean
    public Book romansBook(){
        Book romansBook =new Book(2,"Romeo and Julia","romans of book",150,"soft");
        return romansBook;
    }
    @Bean
    public Book detectiveBook(){
        Book detectiveBook =new Book(3,"James Bond","detective of book",200,"hard");
        return detectiveBook;
    }


    @Bean
    public Magazine gqMagazine(){
        Magazine gqMagazine = new Magazine(4,"GQ","Fashion of industry",20, List.of("Sandals with socks","New Coats"));
        return gqMagazine;
    }

        @Bean
    public Magazine elisMagazine(){
        Magazine elisMagazine =  new Magazine(5,"Elis","Magazine for women ",25, List.of("Sandals with socks","New Coats"));
        return elisMagazine;
    }


        @Bean
    public Newspaper newYorkTimes(){
        Newspaper newYorkTimes =new Newspaper(6,"The New York Times","This is most populate newspaper in World",4,
                Map.of("John Bar", 25,
                        "Jessy Lingard", 3,
                        "Nikolay Fedorov", 12));
        return newYorkTimes;
    }

        @Bean
    public Newspaper dailyNews(){
        Newspaper dailyNews =new Newspaper(7,"The Daily News","This is daily news",2,
                Map.of("Sara Cortny", 5,
                        "Justin Ibragimovich",1 ,
                        "Olga Ivanova", 12));

        return dailyNews;
    }

}
