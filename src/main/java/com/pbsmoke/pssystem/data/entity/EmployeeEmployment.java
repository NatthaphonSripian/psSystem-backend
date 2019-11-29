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
public class EmployeeEmployment {

    @Id
    @GeneratedValue
    private String id;

    public Date startDate;
    public Date endDate;
    public String EmployeeType;
    public double salary;
    private String remark;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "PREVIOUS_EMPLOYMENT_ID")
    private Department previousEmployment;

    @ManyToOne
    @JoinColumn(name="employee_id", nullable=false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_promote_id", nullable = false)
    private EmployeePromote employeePromote;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @OneToMany(mappedBy="employeeEmployment")
    private List<EmployeeEmploymentDetail> employeeEmploymentDetails;
}
