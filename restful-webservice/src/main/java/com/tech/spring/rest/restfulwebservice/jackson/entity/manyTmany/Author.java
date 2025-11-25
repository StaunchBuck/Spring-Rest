package com.tech.spring.rest.restfulwebservice.jackson.entity.manyTmany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private Long id;
    private String name;
    private String email;
    private String gender;
    private int age;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
