package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeGroupDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeGroupMapper {

    public EmployeeGroupDto maperEmployeeGroupToDto(EmployeeGroup employeeGroup) {
        EmployeeGroupDto dto = new EmployeeGroupDto();
        if (employeeGroup != null) {
            dto.setId(employeeGroup.getId());
            dto.setEmployeeGroupCode(employeeGroup.getEmployeeGroupCode());
            dto.setEmployeeGroupNameEn(employeeGroup.getEmployeeGroupNameEn());
            dto.setEmployeeGroupNameTh(employeeGroup.getEmployeeGroupNameTh());
        }
        return dto;
    }
}
