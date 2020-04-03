package com.ms.csvflyway.controller;

import com.ms.csvflyway.entity.Employee;
import com.ms.csvflyway.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public String updateEmployeeById( @PathVariable int id, @RequestBody Employee employee) {
        employeeService.updateEmployeeById(id, employee);
        return "Success";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
         employeeService.deleteEmployeeById(id);
         return "Success";
    }
}
