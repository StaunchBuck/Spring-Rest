package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Entity
@AllArgsConstructor
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;

//    @Column(length = 3)  // sets column length in db
    @Column
    @Size(min = 2, max = 100) // sets validation for field
    private String product;

    @Column
    private Integer quantity;

    @Column
    private String category;
}
