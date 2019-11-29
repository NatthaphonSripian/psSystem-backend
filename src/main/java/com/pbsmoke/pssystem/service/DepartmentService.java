package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Department;
import com.pbsmoke.pssystem.data.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> departmentGetAll() {
        return departmentRepository.findAll();
    }

    public Department departmentGetById(long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    public Department departmentSave(Department department) {
        return departmentRepository.save(department);
    }

    public void departmentDelete(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
