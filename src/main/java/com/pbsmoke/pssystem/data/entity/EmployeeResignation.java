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
public class EmployeeResignation {

    @Id
    @GeneratedValue
    private long id;
    private String resignationNo;
    private Date resignationDate;
    private Date effectDate;
    private String resignationType;
    private String detail;
    private String isCalculateLastPayment;
    private String calculateLastPaymentType;
    private Date resignEffectDate;
    private String isCalculateSalary;
    private String isCalculateLastOccasionalIncomeDeduct;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
}
