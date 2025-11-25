package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"phone","departmentName"}) // composite unique constraint
})
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //generationType AUTO is optional, by default it is AUTO
    private Integer id;
    private String name;
    private String address;
    @Column(unique=true)
    private String phone;
    private String departmentName;
    @Embedded
    private ContactPersonEntity contactPerson;

    // standard getters, setters
}