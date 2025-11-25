package com.tech.spring.rest.restfulwebservice.jackson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Audited
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "student_seq")
    private Long id;
    @Basic(optional = false, fetch = FetchType.LAZY) // makes column not null in db and lazy loading
    private String name;
    @Column(columnDefinition = "varchar(255) default 'xyz@abc.com'") //sets default value in db
    private String email;
    @Column
    private Integer age;
    @Transient //if you want to ignore this field from db
    @NotAudited
    private List<DepartmentEntity> departments;
}
