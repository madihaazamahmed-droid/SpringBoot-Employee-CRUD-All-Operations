package com.jsp.SpringBoot_employee1_crudAlloperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBoot_employee1_crudAlloperations.entity.Employee;
import com.jsp.SpringBoot_employee1_crudAlloperations.service.EmpsService;

@RestController
public class EmployeeController {

    @Autowired
    EmpsService emService;

    // Find All Employees
    @GetMapping("/findAll")
    public List<Employee> findAll() {

        return emService.findAll();
    }
    
    @GetMapping("/find/{id}")
    public Employee getEmployee(@PathVariable int id) {
    	return emService.findEmployee(id);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id) {
    	return emService.deleteById(id);
    	
    }
    
    
    @PutMapping("/update/{id}")
    public String updateEmp(@PathVariable int id,
                            @RequestBody Employee e) {

        emService.updateEmployee(id, e);

        return "Employee updated";
    }
}
  