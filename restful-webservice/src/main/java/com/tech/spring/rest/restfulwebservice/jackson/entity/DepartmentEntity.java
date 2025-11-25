package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class DepartmentEntity {

    @Id
    @GeneratedValue
    private String departmentCode;
    @Column
    private String departmentName;

}
