package com.pbsmoke.pssystem.data.entity.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
public class EmployeeLevelDto {
    private long id;
    private String employeeLevelCode;
    private String employeeLevelNameTh ;
    private String employeeLevelNameEn ;
    private String remark ;
}
