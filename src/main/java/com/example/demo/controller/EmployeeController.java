package com.example.demo.controller;

import com.example.demo.controller.service.EmployeeService;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService eService;


        @GetMapping(value = "/employees")
        public List<Employee> getEmployees() {
            return eService.getEmployees();
        }

        @GetMapping("/employees/{id}")
        public String getEmployee(@PathVariable Long id) {
            return "Fetching the employee details for the id: " + id;

        }

        @PostMapping("/employees")
        public String saveEmployee(@RequestBody Employee employee) {
            return "saving the employee details to the database: " + employee;
        }

        @PutMapping("/employees/{id}")
        public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
            System.out.println("Updating the employee data for the id: " + id);
            return employee;
        }

        @DeleteMapping("/employees")
        public String deleteEmployee(@RequestParam Long id) {
            return "Deleting the employee details for the id: " + id;

        }

    }


