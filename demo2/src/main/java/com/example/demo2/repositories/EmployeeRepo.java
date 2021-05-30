package com.example.demo2.repositories;


import com.example.demo2.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    @Query(value = "select * from employee where address_aid in (select aid from address where lower(city)=:s)",nativeQuery = true)
    List<Employee> findBycityQuery(@Param("s") String s);
}