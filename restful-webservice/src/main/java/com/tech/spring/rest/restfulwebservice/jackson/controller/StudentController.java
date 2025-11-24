package com.tech.spring.rest.restfulwebservice.jackson.controller;

import com.tech.spring.rest.restfulwebservice.jackson.dto.StudentDto;
import com.tech.spring.rest.restfulwebservice.jackson.service.StudentService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable("id") Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getStudentById(id));
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudents());
    }

    @PostMapping
    public ResponseEntity<StudentDto> upsertStudent(@RequestBody StudentDto studentDto){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.createStudent(studentDto));
    }

    @DeleteMapping("/{$id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
