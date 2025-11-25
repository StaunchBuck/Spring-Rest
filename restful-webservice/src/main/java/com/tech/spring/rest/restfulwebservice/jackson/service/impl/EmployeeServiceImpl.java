package com.tech.spring.rest.restfulwebservice.jackson.service.impl;

import com.tech.spring.rest.restfulwebservice.jackson.entity.oneTone.Employee;
import com.tech.spring.rest.restfulwebservice.jackson.service.EmployeeService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = null;
        try{
            list = entityManager.createQuery("FROM Employee", Employee.class).getResultList();
        }catch(Exception ex) {
            log.error("Error while fetching employees: {}", ex.getMessage());
        }
        System.out.println("Employee List: " + list);
        return list;
    }

    @Override // Example of JPQL Query
    @Transactional
    public Employee getEmployeeById(Long id) {
        Query jpqlQuery = entityManager.createQuery("SELECT u FROM Employee u WHERE u.id=:id");
        jpqlQuery.setParameter("id", id);
        return (Employee) jpqlQuery.getSingleResult();

    }
    // Example of Typed Query
    @Transactional
    public Employee getEmployeeById1(Long id) {
        TypedQuery<Employee> typedQuery
                = entityManager.createQuery("SELECT u FROM Employee u WHERE u.id=:id", Employee.class);
        typedQuery.setParameter("id", id);
//        "SELECT u FROM Employee u WHERE u.id=?1"
//        typedQuery.setParameter(1, id); // Using positional parameter
        return typedQuery.getSingleResult();
    }

    // Example of Named Query
    @Transactional
    public Employee getEmployeeById2(Long id) {
        Query namedQuery = entityManager.createNamedQuery("Employee.findByEmployeeId");
        namedQuery.setParameter("id", id);
        return (Employee) namedQuery.getSingleResult();
    }

    // Example of Native Query
    @Transactional
    public Employee getEmployeeById3(Long id) {
        Query nativeQuery
                = entityManager.createNativeQuery("SELECT * FROM Employee WHERE id=:userId", Employee.class);
        nativeQuery.setParameter("userId", id);
        return (Employee) nativeQuery.getSingleResult();
    }
}
