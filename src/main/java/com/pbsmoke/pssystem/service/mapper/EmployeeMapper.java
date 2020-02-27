package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.Date;

@Component
public class EmployeeMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private EmployeeGroupMapper employeeGroupMapper;

    @Autowired
    private EmployeeLevelMapper employeeLevelMapper;


    public EmployeeDto maperAddressToDto(Employee employee) {
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


        return dto;
    }
}
