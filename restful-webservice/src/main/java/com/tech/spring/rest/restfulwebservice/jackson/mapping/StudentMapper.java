package com.tech.spring.rest.restfulwebservice.jackson.mapping;

import com.tech.spring.rest.restfulwebservice.jackson.dto.StudentDto;
import com.tech.spring.rest.restfulwebservice.jackson.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring" ,uses = {DepartmentMapper.class})
public interface StudentMapper {

    StudentDto toDto(StudentEntity entity);

    List<StudentDto> toDtos(List<StudentEntity> entities);

    StudentEntity toEntity(StudentDto dto);

    List<StudentEntity> toEntities(List<StudentDto> dtos);
}
