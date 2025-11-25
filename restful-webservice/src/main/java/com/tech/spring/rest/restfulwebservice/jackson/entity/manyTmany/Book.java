package com.tech.spring.rest.restfulwebservice.jackson.entity.manyTmany;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@Entity
public class Book {

    @Id
    private Long id;
    private String title;
    private String publisher;
    private Double price;
    @ManyToMany
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id")
    )
    private List<Author> authors;
}
