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
public class EmployeeEmploymentDetail {

    @Id
    @GeneratedValue
    private long id;
    public int listNo;
    public double incomeDeductAmount;
    public String incomeDeductType;
    public String paymentType;
    public Date startDate;
    public Date endDate;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @ManyToOne
    @JoinColumn(name="employee_employment_id", nullable=false)
    private EmployeeEmployment employeeEmployment;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "income_deduct_id", nullable = false)
    private IncomeDeduct incomeDeduct;


}
