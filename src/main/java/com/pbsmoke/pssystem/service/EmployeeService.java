package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeDto;
import com.pbsmoke.pssystem.data.repositories.EmployeeRepository;
import com.pbsmoke.pssystem.service.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDto> employeeGetAll() {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        employeeRepository.findAll().forEach(emp -> employeeDtoList.add(employeeMapper.maperAddressToDto(emp)));
        return employeeDtoList;
    }

    public EmployeeDto employeeGetById(long employeeGroupId) {
        return employeeMapper.maperAddressToDto(employeeRepository.findById(employeeGroupId).orElse(null));
    }

    public EmployeeDto employeeSave(Employee employee) {
        return employeeMapper.maperAddressToDto(employeeRepository.save(validateEmployee(employee)));
    }

    public void employeeDelete(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    private Employee validateEmployee(Employee employee) {
        if (employee.getAddresses() != null && employee.getAddresses().getEmployee() == null) {
            employee.getAddresses().setEmployee(employee);
        }

        if (employee.getEmployeeReduceTax() != null && employee.getEmployeeReduceTax().getEmployee() == null) {
            employee.getEmployeeReduceTax().setEmployee(employee);
        }

        return employee;
    }
}
