package com.repository;

import com.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
