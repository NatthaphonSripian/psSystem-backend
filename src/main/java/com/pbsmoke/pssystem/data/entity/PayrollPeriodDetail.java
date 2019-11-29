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
public class PayrollPeriodDetail {

    @Id
    @GeneratedValue
    private String id;
    private int listNo ;
    private String monthNameTh ;
    private String monthNameEn ;
    private Date startDate ;
    private Date endDate ;
    private Date payrollDate ;
    private String calculateType ;
    private String isClose ;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @ManyToOne
    @JoinColumn(name="payroll_period_id", nullable=false)
    private PayrollPeriod payrollPeriod;
    
}
