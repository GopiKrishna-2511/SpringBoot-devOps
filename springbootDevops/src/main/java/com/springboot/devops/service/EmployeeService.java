package com.springboot.devops.service;

import com.springboot.devops.entity.Employee;
import com.springboot.devops.entity.User;
import com.springboot.devops.repository.EmployeeRepository;
import com.springboot.devops.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository emloyeeRepository;

    public Employee getEmployeeById(Integer Id) {
        return emloyeeRepository.findById(Id).get();
    }

    public List<Employee> getEmployersList() {
        return emloyeeRepository.findAll();
    }


    public Employee save(Employee employee) {
        return emloyeeRepository.save(employee);
    }

    public Employee update(Employee employee){

    return   emloyeeRepository.saveAndFlush(employee);
    }

    public void deleteById(Integer id){

           emloyeeRepository.deleteById(id);
    }




}
