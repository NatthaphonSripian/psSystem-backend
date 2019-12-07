package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.data.repositories.EmployeeGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeGroupService {

    @Autowired
    private EmployeeGroupRepository employeeGroupRepository;

    public List<EmployeeGroup> employeeGroupGetAll() {
        return employeeGroupRepository.findAll();
    }

    public EmployeeGroup employeeGroupGetById(long employeeGroupId) {
        return employeeGroupRepository.findById(employeeGroupId).orElse(null);
    }

    public EmployeeGroup employeeGroupSave(EmployeeGroup employeeGroup) {
        return employeeGroupRepository.save(employeeGroup);
    }

    public void employeeGroupDelete(long employeeGroupId) {
        employeeGroupRepository.deleteById(employeeGroupId);
    }
}
