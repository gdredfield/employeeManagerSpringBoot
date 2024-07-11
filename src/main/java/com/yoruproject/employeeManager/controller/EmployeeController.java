package com.yoruproject.employeeManager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yoruproject.employeeManager.model.Employee;
import com.yoruproject.employeeManager.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/getEmployees")
    public ResponseEntity<List<Employee>> getEmployees(){
        List<Employee> response = employeeService.getEmployees();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "/getEmployee/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("empId") Long empId){
        Employee response = employeeService.getEmployee(empId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee response = employeeService.addEmployee(employee);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping(path = "/updateEmployee")
    public ResponseEntity<Employee> getEmployee(@RequestBody Employee employee){
        Employee response = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping(path = "/deleteEmployee/{empId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("empId") Long empId){
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
