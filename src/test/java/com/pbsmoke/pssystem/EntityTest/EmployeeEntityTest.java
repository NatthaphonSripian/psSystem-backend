package com.pbsmoke.pssystem.EntityTest;

import com.pbsmoke.pssystem.data.entity.*;
import com.pbsmoke.pssystem.data.repositories.*;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@Log4j2
public class EmployeeEntityTest {

    @Autowired
    EmployeeLevelRepository employeeLevelRepository;

    @Autowired
    EmployeeGroupRepository employeeGroupRepository;

    @Autowired
    PositionRepository positionRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    BankRepository bankRepository;

    @Autowired
    FundRepository fundRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void A_Employee_only() {
        // Get Data
        EmployeeGroup employeeGroup = employeeGroupRepository.findAll().stream().findFirst().orElse(null);
        EmployeeLevel employeeLevel = employeeLevelRepository.findAll().stream().findFirst().orElse(null);
        Employee employee = new Employee();
        employee.setEmployeeCode("Emp-000" + employeeRepository.findAll().size() + 1);
        employee.setTitleName("Mr.");
        employee.setFirstName("Tests");
        employee.setLastName("Tests");
        employee.setEmployeeGroup(employeeGroup);
        employee.setEmployeeLevel(employeeLevel);
        employeeRepository.save(employee);
    }

    @Test
    void A_Employee_with_address() {
        // Get Data
        EmployeeGroup employeeGroup = employeeGroupRepository.findAll().stream().findFirst().orElse(null);
        EmployeeLevel employeeLevel = employeeLevelRepository.findAll().stream().findFirst().orElse(null);
        Address address = new Address();


        address.setAddressName("address 1");
        Employee employee = new Employee();
        employee.setEmployeeCode("Emp-000" + employeeRepository.findAll().size() + 1);
        employee.setTitleName("Mr.");
        employee.setFirstName("Tests");
        employee.setLastName("Tests");
        employee.setEmployeeGroup(employeeGroup);
        employee.setEmployeeLevel(employeeLevel);
        address.setEmployee(employee);
        employee.setAddresses(address);
        employeeRepository.save(employee);
    }

    @Test
    void A_Employee_with_address_tax() {
        // Get Data
        EmployeeGroup employeeGroup = employeeGroupRepository.findAll().stream().findFirst().orElse(null);
        EmployeeLevel employeeLevel = employeeLevelRepository.findAll().stream().findFirst().orElse(null);
        Address address = new Address();
        address.setAddressName("address 1");
        EmployeeReduceTax reduceTax = new EmployeeReduceTax();
        reduceTax.setChild(2);


        Employee employee = new Employee();
        employee.setEmployeeCode("Emp-000" + employeeRepository.findAll().size() + 1);
        employee.setTitleName("Mr.");
        employee.setFirstName("Tests");
        employee.setLastName("Tests");
        employee.setEmployeeGroup(employeeGroup);
        employee.setEmployeeLevel(employeeLevel);
        address.setEmployee(employee);
        employee.setAddresses(address);
        reduceTax.setEmployee(employee);
        employee.setEmployeeReduceTax(reduceTax);
        employeeRepository.save(employee);
    }
}
