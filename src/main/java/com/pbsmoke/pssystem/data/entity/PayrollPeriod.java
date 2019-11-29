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
public class PayrollPeriod {

    @Id
    @GeneratedValue
    private String id;
    private String payrollPeriodName ;
    private int payrollPeriodYear ;
    private String payrollPeriodType ;
    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @OneToMany(mappedBy="payrollPeriod")
    private List<Employee> employees;

    @OneToMany(mappedBy="payrollPeriod")
    private List<PayrollPeriodDetail> payrollPeriodDetails;
}
