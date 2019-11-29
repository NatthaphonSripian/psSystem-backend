package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Department;
import com.pbsmoke.pssystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getDepartmentAll() {
        return new ResponseEntity<>(departmentService.departmentGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("departmentId") long departmentId) {
        return new ResponseEntity<>(departmentService.departmentGetById(departmentId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.departmentSave(department), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{departmentId}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable("departmentId") long departmentId) {
        departmentService.departmentDelete(departmentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
