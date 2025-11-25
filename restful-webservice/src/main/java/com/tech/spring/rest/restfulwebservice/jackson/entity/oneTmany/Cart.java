package com.tech.spring.rest.restfulwebservice.jackson.entity.oneTmany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cart {

    @Id
    private Long cartId;
    private String cartName;
    @OneToMany(mappedBy = "cart1", cascade = CascadeType.ALL)
    private List<Item> items;
}
