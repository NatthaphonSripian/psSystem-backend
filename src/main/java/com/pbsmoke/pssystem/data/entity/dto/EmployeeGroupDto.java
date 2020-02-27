package com.pbsmoke.pssystem.data.entity.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
public class EmployeeGroupDto {

    private long id;
    private String employeeGroupCode;
    private String employeeGroupNameTh;
    private String employeeGroupNameEn;
    private String remark ;
}
