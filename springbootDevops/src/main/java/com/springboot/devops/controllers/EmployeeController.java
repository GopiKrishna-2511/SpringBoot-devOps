package com.springboot.devops.controllers;

import com.springboot.devops.entity.Employee;
import com.springboot.devops.entity.User;
import com.springboot.devops.service.EmployeeService;
import com.springboot.devops.service.UserService;
import com.springboot.devops.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Utility.base_url)
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployee() {

        List<Employee> employeeList = employeeService.getEmployersList();
        if (employeeList != null) {
            return ResponseEntity.ok(employeeList);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/employee")
    public ResponseEntity<Employee> getById(@RequestParam("Id") Integer Id) {

        Employee employee = employeeService.getEmployeeById(Id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/employee")
    public ResponseEntity deleteEmployeeById(@RequestParam("Id") Integer Id) {
         employeeService.deleteById(Id);
      return (ResponseEntity) ResponseEntity.ok();
    }


}