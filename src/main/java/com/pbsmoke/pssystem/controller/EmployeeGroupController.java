package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.service.EmployeeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/group")
public class EmployeeGroupController {

    @Autowired
    private EmployeeGroupService employeeGroupService;

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeGroup>> getBankAll() {
        return new ResponseEntity<>(employeeGroupService.employeeGroupGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{employeeGroupId}")
    public ResponseEntity<EmployeeGroup> getBankById(@PathVariable("employeeGroupId") String employeeGroupId) {
        return new ResponseEntity<>(employeeGroupService.employeeGroupGetById(Long.parseLong(employeeGroupId)), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeGroup> saveBank(@RequestBody EmployeeGroup employeeGroup) {
        return new ResponseEntity<>(employeeGroupService.employeeGroupSave(employeeGroup), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeGroupId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("employeeGroupId") long employeeGroupId) {
        employeeGroupService.employeeGroupDelete(employeeGroupId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
