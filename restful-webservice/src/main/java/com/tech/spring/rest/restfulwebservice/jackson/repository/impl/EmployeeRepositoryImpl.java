package com.tech.spring.rest.restfulwebservice.jackson.repository.impl;

import com.tech.spring.rest.restfulwebservice.jackson.entity.oneTone.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl {

//    @PersistenceContext
     /*
         Extended persistence context.
         It remains active until the EntityManager is closed.
         It is useful in long-running conversations.
         Default is TRANSACTION.
     */
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;

    public Employee findByEmployeeId(Long id) {
        return entityManager.createNamedQuery("Employee.findByEmployeeId", Employee.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
