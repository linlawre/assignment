package com.service;

import com.domain.Employee;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements com.service.EmployeeService {
    URI uri = new URI("https://dummy.restapiexample.com/api/v1/employees");
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) throws URISyntaxException {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public List<Employee> listAll() {
        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
                = "https://dummy.restapiexample.com/api/v1/employees";

        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl, String.class);

        String productsJson = response.getBody();
        
        return productsJson;
    }


}
