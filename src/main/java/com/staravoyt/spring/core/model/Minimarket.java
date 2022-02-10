package com.staravoyt.spring.core.model;

import com.staravoyt.spring.core.qualifiers.NewYorkTimesQualifier;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource("classpath:minimarket.properties")
public class Minimarket implements PrintData
{
    @Value("${minimarket.id}")
    private int id;
    @Value("${minimarket.name}")
    private String name;
    @Autowired
    @NewYorkTimesQualifier
//    @Value("#{dailyNews}") так можно инжектить но не нужно, но не нужно
    private Newspaper newspaper;
    @Autowired
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Map<String,Newspaper> newspaperMap;
    @Value("${minimarket.newspaper}")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private String newspaperName;


    @PostConstruct
    public void startMethod(){
        newspaper=newspaperMap.get(newspaperName);
        System.out.println("Сработал startMethod-очень важный метод  !!!!!" +newspaper);
    }
   @PreDestroy
    public void finishMethod(){
        System.out.println("Ура наконец-то мы отработали КОНЕЦ!!!");
    }


}
