package com.tech.spring.rest.restfulwebservice.jackson.entity.oneTone;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String city;
    private String country;
    @OneToOne(mappedBy = "address1" ,cascade = CascadeType.ALL) // bidirectional mapping. "address1" is the field name in Employee class. It is optional.
    private Employee employee;
}
