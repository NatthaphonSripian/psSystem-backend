package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class EmployeeReduceTax {

    @Id
    @GeneratedValue
    private long id;
    private String spouseDivide ;
    private String spouseReduce ;
    private int child ;
    private int childNotStudy ;
    private double insuranceAmount ;
    private double spouseInsuranceAmount ;
    private double donationCharity ;
    private double donationEducation ;
    private double interestLoan ;
    private double rmfDeposit ;
    private double ltfDeposit ;
    private double compensationLaw ;
    private double gpfDeposit ;
    private double assistInstructor ;
    private double fatherIdCardNo ;
    private double fatherReduceAmount ;
    private double motherIdCardNo ;
    private double motherReduceAmount ;
    private double fatherHealthInsurance ;
    private double motherHealthInsurance ;
    private double longInsurance ;
    private Boolean isTwoBenefits ;
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
    @ToString.Exclude
    private Employee employee;
}
