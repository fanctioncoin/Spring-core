package com.staravoyt.spring.core.model;

import com.staravoyt.spring.core.model.Book;
import com.staravoyt.spring.core.model.Magazine;
import com.staravoyt.spring.core.model.Newspaper;
import com.staravoyt.spring.core.model.PrintData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//"Эта модель создана для демонстрации autowiring by name, byType не хотелось менять старые модели"
public class Supermarket implements PrintData
{
    private int id;
    private String name;
    @Autowired
    @Qualifier(value = "romansBook-qualifier")
    private Book book;
//    private Book romansBook;




}
