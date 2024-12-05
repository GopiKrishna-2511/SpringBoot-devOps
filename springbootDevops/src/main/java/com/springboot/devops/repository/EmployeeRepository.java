package com.springboot.devops.repository;

import com.springboot.devops.entity.Employee;
import com.springboot.devops.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
