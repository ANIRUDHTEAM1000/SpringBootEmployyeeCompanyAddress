package com.example.demo2.controllers;

import com.example.demo2.models.Company;
import com.example.demo2.models.Employee;
import com.example.demo2.services.AddressService;
import com.example.demo2.services.CompanyService;
import com.example.demo2.services.EmployeeService;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@ResponseBody
public class BaseController {

    @Autowired  private AddressService addressService;
    @Autowired  private CompanyService companyService;
    @Autowired  private EmployeeService employeeService;

    @PostMapping("/company/add")
    public Company addCompany(@RequestBody Company c)
    {
        return companyService.saveCompany(c);
    }

    @GetMapping("user/bycity")
    public List<Employee> getByCity(String city)
    {
        if(city==null)
        {
            return employeeService.getAllEmployees();

        }
        else {
            return employeeService.getAllByCity(city);
        }
    }

}

