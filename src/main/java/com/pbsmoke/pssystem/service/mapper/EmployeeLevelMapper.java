package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.data.entity.EmployeeLevel;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeGroupDto;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeLevelDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLevelMapper {

    public EmployeeLevelDto maperEmployeeLevelToDto(EmployeeLevel employeeLevel) {
        EmployeeLevelDto dto = new EmployeeLevelDto();
        if (employeeLevel != null) {
            dto.setId(employeeLevel.getId());
            dto.setEmployeeLevelCode(employeeLevel.getEmployeeLevelCode());
            dto.setEmployeeLevelNameEn(employeeLevel.getEmployeeLevelNameEn());
            dto.setEmployeeLevelNameTh(employeeLevel.getEmployeeLevelNameTh());
        }
        return dto;
    }
}
