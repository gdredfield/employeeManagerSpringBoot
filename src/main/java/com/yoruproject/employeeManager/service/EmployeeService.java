package com.yoruproject.employeeManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.yoruproject.employeeManager.model.Employee;
import com.yoruproject.employeeManager.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long empId){
        employeeRepository.deleteById(empId);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC,"empId"));
    }

    public Employee getEmployee(Long empId){
        return employeeRepository.findById(empId)
        .orElseThrow(() -> new IllegalStateException("Employee does not exist."));
    }

}
