package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private EmployeeGroupMapper employeeGroupMapper;

    @Autowired
    private EmployeeLevelMapper employeeLevelMapper;

    @Autowired
    private EmployeeSocialMapper employeeSocialMapper;

    @Autowired
    private EmployeeReduceTaxMapper employeeReduceTaxMapper;


    public EmployeeDto mapEmployeeDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setEmployeeCode(employee.getEmployeeCode());
        dto.setTitleName(employee.getTitleName());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setGender(employee.getGender());
        dto.setWeight(employee.getWeight());
        dto.setWeight(employee.getHeight());
        dto.setNationalism(employee.getNationalism());
        dto.setNationality(employee.getNationality());
        dto.setReligion(employee.getReligion());
        dto.setBirthDate(employee.getBirthDate());
        dto.setMarry(employee.getMarry());
        dto.setMilitary(employee.getMilitary());
        dto.setIdCard(employee.getIdCard());
        dto.setCreatedDate(employee.getCreatedDate());
        dto.setCreatedBy(employee.getCreatedBy());
        dto.setEditDate(employee.getEditDate());
        dto.setEditBy(employee.getEditBy());

        dto.setEmployeeGroup(employeeGroupMapper.maperEmployeeGroupToDto(employee.getEmployeeGroup()));
        dto.setEmployeeLevel(employeeLevelMapper.maperEmployeeLevelToDto(employee.getEmployeeLevel()));

        if (employee.getAddresses() != null) {
            dto.setAddresses(addressMapper.maperAddressToDto(employee.getAddresses()));
        }

        if (employee.getEmployeeSocial() != null) {
            dto.setEmployeeSocial(employeeSocialMapper.mapperEmployeeSocialDto(employee.getEmployeeSocial()));
        }

        if (employee.getEmployeeReduceTax() != null) {
            dto.setEmployeeReduceTax(employeeReduceTaxMapper.mapperEmployeeReduceTaxDto(employee.getEmployeeReduceTax()));
        }

        return dto;
    }
}
