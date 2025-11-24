package com.tech.spring.rest.restfulwebservice.jackson.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
public class StudentDto {

    @JsonProperty("student_id")
    @NotNull
    private Long id;
    @JsonProperty("student_name")
    @Size(min = 2, max = 50)
    private String name;
    @Email(message = "Email should be valid")
    private String email;
    private Integer age;
    @JsonIgnore
    private List<DepartmentDto> departments;
}
