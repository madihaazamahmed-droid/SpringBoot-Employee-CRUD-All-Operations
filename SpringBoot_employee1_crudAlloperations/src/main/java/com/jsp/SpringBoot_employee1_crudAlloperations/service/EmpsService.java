package com.jsp.SpringBoot_employee1_crudAlloperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.SpringBoot_employee1_crudAlloperations.entity.Employee;
import com.jsp.SpringBoot_employee1_crudAlloperations.repository.EmployeeRepository;

@Service
public class EmpsService {

    @Autowired
    EmployeeRepository empsrepository;

    // Save All Employees
    public List<Employee> saveAll(List<Employee> emp) {
        return empsrepository.saveAll(emp);
    }

    // Find All Employees
    public List<Employee> findAll() {
        return empsrepository.findAll();
    }

    // Find Employee By ID
    public Employee findEmployee(int id) {

        Optional<Employee> e = empsrepository.findById(id);

        if (e.isPresent()) {
            return e.get();
        } else {
            return null;
        }
    }

    // Delete Employee By ID
    public String deleteById(int id) {

        empsrepository.deleteById(id);

        return "Employee Deleted Successfully";
    }

    // Update Employee
    public Employee updateEmployee(int id, Employee e) {

        Optional<Employee> byId = empsrepository.findById(id);

        if (byId.isPresent()) {

            e.setId(id);

            return empsrepository.save(e);

        } else {

            return null;
        }
    }
}