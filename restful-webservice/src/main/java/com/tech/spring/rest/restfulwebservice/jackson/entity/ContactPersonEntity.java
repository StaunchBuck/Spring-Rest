package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
@AttributeOverrides({
        @AttributeOverride(name = "phone", column = @Column(name = "contact_phone")), // to avoid column name conflict
})
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"contact_phone","departmentName"}) // composite unique constraint
})
public class ContactPersonEntity implements Serializable {
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String phone;
    private String departmentName;
}