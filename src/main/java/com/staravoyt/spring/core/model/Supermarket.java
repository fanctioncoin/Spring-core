package com.staravoyt.spring.core.model;

import com.staravoyt.spring.core.qualifiers.CustomStringQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Supermarket implements PrintData
{
    private int id;
    private String name;
    @Autowired
    @CustomStringQualifier(name="detective")
    private Book book;

}
