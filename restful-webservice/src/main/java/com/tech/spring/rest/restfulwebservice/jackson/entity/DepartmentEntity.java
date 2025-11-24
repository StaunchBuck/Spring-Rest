package com.tech.spring.rest.restfulwebservice.jackson.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentEntity {

    private String departmentName;
    private String departmentCode;
}
