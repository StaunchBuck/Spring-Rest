package com.tech.spring.rest.restfulwebservice.jackson.service;

import com.tech.spring.rest.restfulwebservice.jackson.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public StudentDto getStudentById(long id);

    public List<StudentDto> getAllStudents();

    public StudentDto createStudent(StudentDto student);

    public StudentDto updateStudent(long id, StudentDto student);

    public StudentDto deleteStudent(long id);

}
