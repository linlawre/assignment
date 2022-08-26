package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Assignment {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
                = "https://dummy.restapiexample.com/api/v1/employees";

        // Fetch JSON response as String wrapped in ResponseEntity
        ResponseEntity<String> response
                = restTemplate.getForEntity(resourceUrl, String.class);

        String productsJson = response.getBody();

        System.out.println(productsJson);
    }
}
