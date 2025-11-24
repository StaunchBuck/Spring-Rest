package com.tech.spring.rest.restfulwebservice.jackson.entity;

import com.tech.spring.rest.restfulwebservice.jackson.dto.DepartmentDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentEntity {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private List<DepartmentEntity> departments;
}
