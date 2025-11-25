package com.tech.spring.rest.restfulwebservice.jackson.entity.oneTone;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@NamedQuery(name = "Employee.findByEmployeeId", query = "SELECT u FROM Employee u WHERE u.id=:id")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address1;
}
