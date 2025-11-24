package com.tech.spring.rest.restfulwebservice.jackson.service.impl;

import com.tech.spring.rest.restfulwebservice.jackson.dto.StudentDto;
import com.tech.spring.rest.restfulwebservice.jackson.entity.DepartmentEntity;
import com.tech.spring.rest.restfulwebservice.jackson.entity.StudentEntity;
import com.tech.spring.rest.restfulwebservice.jackson.exception.StudentNotFoundException;
import com.tech.spring.rest.restfulwebservice.jackson.mapping.StudentMapper;
import com.tech.spring.rest.restfulwebservice.jackson.repository.StudentRepository;
import com.tech.spring.rest.restfulwebservice.jackson.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    DepartmentEntity d1 = new DepartmentEntity("Computer Science", "CSE");
    DepartmentEntity d2 = new DepartmentEntity("Mechanical", "ME");
    DepartmentEntity d3 = new DepartmentEntity("Civil", "CE");
    DepartmentEntity d4 = new DepartmentEntity("Electrical", "EE");

    StudentEntity st1 = new StudentEntity(1L, "John Doe", "john.doe@test.com", 23,List.of(d1,d2));
    StudentEntity st2 = new StudentEntity(2L, "Jane Smith", "jane.smith@test.com", 22,List.of(d3));
    StudentEntity st3 = new StudentEntity(3L, "Alice Johnson", "alice.johnson@test.com", 24,List.of(d4,d1));


//    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    @Override
    public StudentDto getStudentById(long id) {
        StudentEntity studentEntity = Stream.of(st1,st2,st3)
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
        return studentMapper.toDto(studentEntity);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentEntity> students = List.of(st1,st2,st3);
        return studentMapper.toDtos(students);
    }

    @Override
    public StudentDto createStudent(StudentDto student) {
        return null;
    }

    @Override
    public StudentDto updateStudent(long id, StudentDto student) {
        return null;
    }

    @Override
    public StudentDto deleteStudent(long id) {
        return null;
    }
}
