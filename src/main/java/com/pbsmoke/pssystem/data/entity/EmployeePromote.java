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
public class EmployeePromote {

    @Id
    @GeneratedValue
    private long id;
    private String promoteNo ;
    private Date promoteDate ;
    private Date effectDate ;
    private String Remark ;
    private String isEmployeeTypePromote ;
    private String fromEmployeeType ;
    private String employeeType ;
    private String isSalaryPromote ;
    private double beforeWageRate ;
    private double adjustAmount ;
    private double adjustPercentRate ;
    private double afterAdjustAmount ;
    private String isOrganizationPromote ;
    private Boolean isDepartmentPromote ;
    private Boolean isPositionPromote ;

    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;



    @ManyToOne
    @JoinColumn(name="employee_id", nullable=false)
    private Employee employee;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employeePromote")
    private EmployeeEmployment employeeEmployment;

}
