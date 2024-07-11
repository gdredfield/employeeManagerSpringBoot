package com.yoruproject.employeeManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_mst")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id", nullable = false, updatable = false)
    private Long empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_email")
    private String empEmail;
    @Column(name = "emp_jobtitle")
    private String empJobTitle;
    @Column(name = "emp_phonenumber")
    private String empPhoneNumber;
    @Column(name = "emp_imageurl")
    private String imageUrl;
    @Column(name = "emp_code", nullable = false, updatable = false)
    private String employeeCode;

    public Employee(){

    }
    
    public Employee(Long empId, String empName, String empEmail, String empJobTitle, String empPhoneNumber,
            String imageUrl, String employeeCode) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empJobTitle = empJobTitle;
        this.empPhoneNumber = empPhoneNumber;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Employee(String empName, String empEmail, String empJobTitle, String empPhoneNumber, String imageUrl,
            String employeeCode) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empJobTitle = empJobTitle;
        this.empPhoneNumber = empPhoneNumber;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getEmpId() {
        return empId;
    }
    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public String getEmpJobTitle() {
        return empJobTitle;
    }
    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }
    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }
    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empJobTitle="
                + empJobTitle + ", empPhoneNumber=" + empPhoneNumber + ", imageUrl=" + imageUrl + ", employeeCode="
                + employeeCode + "]";
    }


}
