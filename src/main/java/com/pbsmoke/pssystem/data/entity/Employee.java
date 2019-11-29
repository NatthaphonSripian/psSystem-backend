package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Employee {
    @Id
    @GeneratedValue
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
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate ;
    private String editBy ;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate ;

    @OneToMany(mappedBy = "employee")
    private List<Address> addresses;

    @OneToMany(mappedBy="employee")
    private List<EmployeeEducation> employeeEducations;

    @OneToMany(mappedBy="employee")
    private List<EmployeeContract> employeeContracts;

    @OneToMany(mappedBy="employee")
    private List<EmployeeExperience> employeeExperiences;

    @OneToMany(mappedBy="employee")
    private List<EmployeeFund> employeeFunds;

    @OneToMany(mappedBy="employee")
    private List<EmployeeGuarantee> employeeGuarantees;

    @OneToMany(mappedBy = "employee")
    private List<EmployeePromote> employeePromotes;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeEmployment> employeeEmployments;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeResignation> employeeResignations;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private EmployeeReduceTax employeeReduceTax;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private EmployeeSocial employeeSocial;

    @ManyToOne
    @JoinColumn(name="payroll_period_id")
    private PayrollPeriod payrollPeriod;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Users users;

}
