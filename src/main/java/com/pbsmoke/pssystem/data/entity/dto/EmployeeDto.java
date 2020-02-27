package com.pbsmoke.pssystem.data.entity.dto;

import com.pbsmoke.pssystem.data.entity.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
public class EmployeeDto {

    private long id;
    public String employeeCode ;
    public String titleName ;
    public String firstName ;
    public String lastName ;
    public String gender ;
    public double weight ;
    public double height ;
    public String nationalism;
    public String nationality ;
    public String religion ;
    public Date birthDate ;
    public String marry ;
    public String military ;
    public String idCard ;
    private String createdBy ;
    private Date createdDate ;
    private String editBy ;
    private Date editDate ;
    private AddressDto addresses;

    private EmployeeGroupDto employeeGroup;
    private EmployeeLevelDto employeeLevel;
    private List<EmployeeEducation> employeeEducations;
    private List<EmployeeContract> employeeContracts;
    private List<EmployeeExperience> employeeExperiences;
    private List<EmployeeFund> employeeFunds;
    private List<EmployeeGuarantee> employeeGuarantees;
    private List<EmployeePromote> employeePromotes;
    private List<EmployeeEmployment> employeeEmployments;
    private List<EmployeeResignation> employeeResignations;
    private EmployeeReduceTax employeeReduceTax;
    private EmployeeSocial employeeSocial;
    private PayrollPeriod payrollPeriod;
    private Users users;
}
