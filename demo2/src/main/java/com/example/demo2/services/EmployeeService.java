package com.example.demo2.services;

import com.example.demo2.models.Employee;
import com.example.demo2.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<Employee> getAllByCity(String s){
        return employeeRepo.findBycityQuery(s.toLowerCase());
    }
}
