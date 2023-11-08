package com.springboot.cruddemo.rest;

import com.springboot.cruddemo.dao.EmployeeDAO;
import com.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        this.employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employess")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

}
