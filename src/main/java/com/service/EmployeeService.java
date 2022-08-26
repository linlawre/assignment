package com.service;

import com.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {

    List<Employee> listAll();

}
