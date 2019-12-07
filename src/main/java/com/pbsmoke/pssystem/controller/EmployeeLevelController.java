package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.EmployeeLevel;
import com.pbsmoke.pssystem.service.EmployeeLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/level")
public class EmployeeLevelController {

    @Autowired
    private EmployeeLevelService employeeLevelService;

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeLevel>> getBankAll() {
        return new ResponseEntity<>(employeeLevelService.employeeLevelGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{employeeLevelId}")
    public ResponseEntity<EmployeeLevel> getBankById(@PathVariable("employeeLevelId") long employeeLevelId) {
        return new ResponseEntity<>(employeeLevelService.employeeLevelGetById(employeeLevelId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeLevel> saveBank(@RequestBody EmployeeLevel employeeLevel) {
        return new ResponseEntity<>(employeeLevelService.employeeLevelSave(employeeLevel), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeLevelId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("employeeLevelId") long employeeLevelId) {
        employeeLevelService.employeeLevelDelete(employeeLevelId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
