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
public class IncomeDeduct {

    @Id
    @GeneratedValue
    private long id;

    private String incomeDeductCode;
    private String incomeDeductNameTh;
    private String incomeDeductNameEn;
    private String calculateMethod;
    private double Value;
    private String incomeDeductType;
    private Boolean isCalculateTax;
    private Boolean isCalculateSocial;
    private Boolean isCalculateFund;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "incomeDeduct")
    private EmployeeEmploymentDetail employeeEmploymentDetail;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "incomeDeduct")
    private EmployeeSocial employeeSocial;
}
