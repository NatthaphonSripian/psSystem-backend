package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.data.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employeeGetAll() {
        return employeeRepository.findAll();
    }

    public Employee employeeGetById(long employeeGroupId) {
        return employeeRepository.findById(employeeGroupId).orElse(null);
    }

    public Employee employeeSave(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void employeeDelete(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
