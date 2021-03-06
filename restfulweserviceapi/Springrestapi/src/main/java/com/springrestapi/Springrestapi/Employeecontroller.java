package com.springrestapi.Springrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;

@RestController
public class Employeecontroller {

    @GetMapping("/")
    public String welcomePage() {
        return "Welcome to spring boot";
    }

    @Autowired
    private Employeeservice employeeService;

    @GetMapping("/employees")
    public ArrayList<Employee> retrieveAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployeeById(@PathVariable int id) throws EmployeeNotFoundException {
        Employee employee = employeeService.findOneById(id);
        if (employee == null)
            throw new EmployeeNotFoundException("Incorrect id");
        return employee;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee)  {
        Employee newEmployee = employeeService.createNewEmployee(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(newEmployee
                        .getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/employees")
    public ResponseEntity<Object> updateEmployee(@Valid @RequestBody Employee employee) throws EmployeeNotFoundException {
        Employee employee1 = employeeService.updateEmployeeDetails(employee);
        if (employee1 == null)
            throw new EmployeeNotFoundException("Incorrect id");
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(employee1.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException {
        Employee employee = employeeService.deleteById(id);
        if (employee == null)
            throw new EmployeeNotFoundException("Incorrect id");
    }
}
