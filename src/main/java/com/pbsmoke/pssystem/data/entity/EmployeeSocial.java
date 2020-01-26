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
public class EmployeeSocial {

    @Id
    @GeneratedValue
    private long id;
    private String isSocialReduce ;
    private String socialNo ;
    private Date registerDate ;
    private String clinic ;
    private String isBeforeSocial ;
    private String beforeOrganizationName ;
    private double beginSocial ;
    private double beginIncome ;
    private double beginTax ;
    private double beginSavingFund ;
    private double workerReduce ;
    private double employerReduce ;
    private double accumulateIncome ;
    private double accumulateSocial ;
    private double accumulateFunds ;
    private double accumulateTax ;
    private String reduceType ;
    private double paymentPercent ;

    private String createdBy ;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate ;
    private String editBy ;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate ;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "income_deduct_id", nullable = false)
    private IncomeDeduct incomeDeduct;
}

