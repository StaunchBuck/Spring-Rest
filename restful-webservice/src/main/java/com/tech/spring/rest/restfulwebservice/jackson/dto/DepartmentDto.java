package com.tech.spring.rest.restfulwebservice.jackson.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DepartmentDto {

    private String name;
    private String code;
}
