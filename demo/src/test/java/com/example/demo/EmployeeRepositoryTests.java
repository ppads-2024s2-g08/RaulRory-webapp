package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeRepositoryTests {
    
    @Autowired
	private TestRestTemplate template;

    @Test
    public void getEmployees() throws Exception {
        ResponseEntity<Employee> response = template.getForEntity("/employees", Employee.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
    
}
