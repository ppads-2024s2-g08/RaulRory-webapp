package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}