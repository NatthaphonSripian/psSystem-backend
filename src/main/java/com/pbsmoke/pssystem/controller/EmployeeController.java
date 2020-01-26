package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getBankAll() {
        return new ResponseEntity<>(employeeService.employeeGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getBankById(@PathVariable("employeeId") String employeeId) {
        return new ResponseEntity<>(employeeService.employeeGetById(Long.parseLong(employeeId)), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveBank(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.employeeSave(employee), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("employeeId") long employeeId) {
        employeeService.employeeDelete(employeeId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
