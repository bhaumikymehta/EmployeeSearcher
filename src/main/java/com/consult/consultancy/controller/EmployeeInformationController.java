package com.consult.consultancy.controller;


import com.consult.consultancy.model.Employee;
import com.consult.consultancy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeInformationController {

//    EmployeeRepository repository;
//    @Autowired
//    EmployeeInformationController(EmployeeRepository repository){
//        this.repository=repository;
//    }
    @GetMapping("/columns/{employee}")
    public List<Employee> getAllColumns(@PathVariable ("employee") String employee ) {
//        List<Employee> employeesList=repository.findByEmployeeName(employee);
//        return employeesList;
 //        return new Employee(Arrays.asList("abc", "def"));
        return (List<Employee>) new Employee(Arrays.asList("abc","deg"));
    }

    @PostMapping("/addColumn")
    public Employee createNewColumn(@RequestBody String columnName) {
        System.out.println("ColumnName:" + columnName);
        return new Employee(Arrays.asList("abc", "def", columnName));
    }
}
