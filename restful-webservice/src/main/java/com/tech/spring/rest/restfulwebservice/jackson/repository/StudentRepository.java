package com.tech.spring.rest.restfulwebservice.jackson.repository;

import com.tech.spring.rest.restfulwebservice.jackson.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {


}
