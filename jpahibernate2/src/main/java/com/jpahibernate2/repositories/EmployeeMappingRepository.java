package com.jpaassignment2.jpahibernate2.repositories;


import com.jpaassignment2.jpahibernate2.entities.EmployeeMapping;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeMappingRepository extends CrudRepository<EmployeeMapping, Integer> {
}
