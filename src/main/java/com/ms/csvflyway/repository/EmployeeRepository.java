package com.ms.csvflyway.repository;

import com.ms.csvflyway.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findEmployeeById(int id);

    List<Employee> findEmployeeByName(String name);
}