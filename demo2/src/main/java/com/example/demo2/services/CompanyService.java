package com.example.demo2.services;


import com.example.demo2.models.Company;
import com.example.demo2.repositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepo companyRepo;

    public Company saveCompany(Company c) {
        return companyRepo.save(c);
    }
}
