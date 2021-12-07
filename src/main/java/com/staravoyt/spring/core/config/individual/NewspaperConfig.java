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
@PropertySource("classpath:newspapers.properties")
public class NewspaperConfig {


//    @CustomStringQualifier(name = "newYork")
    @NewYorkTimesQualifier
    @Bean
    public Newspaper newYorkTimes(@Value("${newYorkTimes.id}") int id,
                                  @Value("${newYorkTimes.name}") String name,
                                  @Value("${newYorkTimes.description}") String description,
                                  @Value("${newYorkTimes.price}") int price,
                                  @Value("#{${newYorkTimes.authorMap}}") Map<String, Integer> authorMap) {
        Newspaper newYorkTimes = new Newspaper(id, name, description, price, authorMap);
        return newYorkTimes;
    }
    @CustomStringQualifier(name = "daily")
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
