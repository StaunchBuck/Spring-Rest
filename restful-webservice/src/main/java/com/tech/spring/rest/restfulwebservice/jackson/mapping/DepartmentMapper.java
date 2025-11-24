package com.tech.spring.rest.restfulwebservice.jackson.mapping;

import com.tech.spring.rest.restfulwebservice.jackson.dto.DepartmentDto;
import com.tech.spring.rest.restfulwebservice.jackson.entity.DepartmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    @Mapping(source = "departmentName", target = "name")
    @Mapping(source = "departmentCode", target = "code", qualifiedByName = "appendUpperCaseMapper")
    DepartmentDto toDto(DepartmentEntity entity);

    List<DepartmentDto> toDtos(List<DepartmentEntity> entities);

    DepartmentEntity toEntity(DepartmentDto dto);

    List<DepartmentEntity> toEntities(List<DepartmentDto> dtos);

    @Named("appendUpperCaseMapper")
    static String upperCaseMapper(String departmentCode) {
        return departmentCode != null ? "CAA-"+departmentCode.toUpperCase() : null;
    }
}
