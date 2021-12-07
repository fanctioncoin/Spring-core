package com.staravoyt.spring.core.model;


import lombok.*;
import org.springframework.stereotype.Component;


@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Book extends Product {
    private String binding; // Attribute указывающий на переплет книги

    public Book(int id, String name, String description, int price, String binding) {
        super(id, name, description, price);
        this.binding = binding;
    }

}
