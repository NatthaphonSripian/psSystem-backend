package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;
    private String departmentCode;
    private String departmentNameTh;
    private String departmentNameEn;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @ManyToOne
    @JoinColumn(name="organization_id", nullable=true)
    private Organization organization;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "PARENT_DEPARTMENT_ID")
    private Department parentDepartment;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "department")
    private EmployeePromote employeePromote;
}
