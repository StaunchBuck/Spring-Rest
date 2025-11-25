package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Basic(optional = false, fetch = FetchType.LAZY) // makes column not null in db and lazy loading
    private String name;
    @Column(columnDefinition = "varchar(255) default 'xyz@abc.com'") //sets default value in db
    private String email;
    @Column
    private Integer age;
    @Transient //if you want to ignore this field from db
    private List<DepartmentEntity> departments;
}
