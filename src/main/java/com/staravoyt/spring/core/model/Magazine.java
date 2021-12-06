package com.staravoyt.spring.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Product {
    private List<String> listOfSensation; // Список сенсаций в журнале

    public Magazine(int id, String name, String description, int price, List<String> listOfSensation) {
        super(id, name, description, price);
        this.listOfSensation = listOfSensation;
    }
}
