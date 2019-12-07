package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.EmployeeLevel;
import com.pbsmoke.pssystem.data.entity.Fund;
import com.pbsmoke.pssystem.data.repositories.EmployeeLevelRepository;
import com.pbsmoke.pssystem.data.repositories.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeLevelService {

    @Autowired
    private EmployeeLevelRepository employeeLevelRepository;

    public List<EmployeeLevel> employeeLevelGetAll() {
        return employeeLevelRepository.findAll();
    }

    public EmployeeLevel employeeLevelGetById(long employeeLevelId) {
        return employeeLevelRepository.findById(employeeLevelId).orElse(null);
    }

    public EmployeeLevel employeeLevelSave(EmployeeLevel fund) {
        return employeeLevelRepository.save(fund);
    }

    public void employeeLevelDelete(long employeeLevelId) {
        employeeLevelRepository.deleteById(employeeLevelId);
    }
}
