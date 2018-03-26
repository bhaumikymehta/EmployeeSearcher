package com.consult.consultancy.controller;


import com.consult.consultancy.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/employees")
public class EmployeeInformationController {

    @GetMapping("/columns")
    public Employee getAllColumns(){

        return new Employee(Arrays.asList("abc","def"));
    }

    @PostMapping("/addColumn")
    public Employee createNewColumn(@RequestBody String columnName)
    {
        System.out.println("ColumnName:"+columnName);
        return new Employee(Arrays.asList("abc","def",columnName));
    }
}
