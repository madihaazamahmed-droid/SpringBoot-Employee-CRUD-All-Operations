package com.jsp.SpringBoot_employee1_crudAlloperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBoot_employee1_crudAlloperations.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}