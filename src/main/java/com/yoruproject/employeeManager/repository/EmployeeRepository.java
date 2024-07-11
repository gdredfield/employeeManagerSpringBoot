package com.yoruproject.employeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoruproject.employeeManager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
