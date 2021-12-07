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
@PropertySource("classpath:magazines.properties")
public class MagazinesConfig {

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

}
