package com.pbsmoke.pssystem.EntityTest;

import com.pbsmoke.pssystem.data.entity.*;
import com.pbsmoke.pssystem.data.repositories.*;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;

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

    private Employee prepareDataEmployee() {
        EmployeeGroup employeeGroup = employeeGroupRepository.findAll().stream().findAny().orElse(null);
        EmployeeLevel employeeLevel = employeeLevelRepository.findAll().stream().findAny().orElse(null);
        Employee employee = new Employee();
        employee.setEmployeeCode("Emp-000" + (employeeRepository.findAll().size() + 1));
        employee.setTitleName("Mr.");
        employee.setFirstName("Tests");
        employee.setLastName("Tests");
        employee.setEmployeeGroup(employeeGroup);
        employee.setEmployeeLevel(employeeLevel);
        return employee;
    }

    @Test
    @Order(0)
    void A_Employee_only() {
        Employee employee = prepareDataEmployee();
        employeeRepository.save(employee);
    }

    @Test
    @Order(1)
    void A_Employee_with_address() {
        Employee employee = prepareDataEmployee();
        Address address = new Address();
        address.setAddressName("address 1");
        address.setEmployee(employee);
        employee.setAddresses(address);
        employeeRepository.save(employee);
    }

    @Test
    @Order(2)
    void A_Employee_with_address_tax() {
        Employee employee = prepareDataEmployee();
        Address address = new Address();
        address.setAddressName("address 1");
        EmployeeReduceTax reduceTax = new EmployeeReduceTax();
        reduceTax.setChild(2);
        address.setEmployee(employee);
        employee.setAddresses(address);
        reduceTax.setEmployee(employee);
        employee.setEmployeeReduceTax(reduceTax);
        employeeRepository.save(employee);
    }

    @Test
    @Order(3)
    void A_Employee_with_address_tax_Social() {
        Employee employee = prepareDataEmployee();
        Address address = new Address();
        address.setAddressName("address 1");
        EmployeeReduceTax reduceTax = new EmployeeReduceTax();
        reduceTax.setChild(2);
        EmployeeSocial social = new EmployeeSocial();
        social.setAccumulateFunds(10000.00);
        social.setAccumulateIncome(1000.00);
        social.setAccumulateSocial(1000.00);
        social.setBeforeOrganizationName("Org Old");
        address.setEmployee(employee);
        employee.setAddresses(address);
        reduceTax.setEmployee(employee);
        employee.setEmployeeReduceTax(reduceTax);
        social.setEmployee(employee);
        employeeRepository.save(employee);
    }

    @Test
    @Order(4)
    void A_Employee_with_address_tax_Social_employment() {
        Employee employee = prepareDataEmployee();
        Address address = new Address();
        address.setAddressName("address 1");
        EmployeeReduceTax reduceTax = new EmployeeReduceTax();
        reduceTax.setChild(2);
        EmployeeSocial social = new EmployeeSocial();
        social.setAccumulateFunds(10000.00);
        social.setAccumulateIncome(1000.00);
        social.setAccumulateSocial(1000.00);
        social.setBeforeOrganizationName("Org Old");
        address.setEmployee(employee);
        employee.setAddresses(address);
        reduceTax.setEmployee(employee);
        employee.setEmployeeReduceTax(reduceTax);
        social.setEmployee(employee);

        EmployeeEmployment employment = new EmployeeEmployment();
        Position position = positionRepository.findAll().stream().findAny().orElse(null);
        Department department = departmentRepository.findAll().stream().findAny().orElse(null);
        employment.setStartDate(new Date());
        employment.setPosition(position);
        employment.setDepartment(department);
        employment.setEmployee(employee);
        employee.setEmployeeEmployments(Arrays.asList(employment));
        employeeRepository.save(employee);
    }
}
