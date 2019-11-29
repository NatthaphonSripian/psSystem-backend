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
public class EmployeeExperience {

    @Id
    @GeneratedValue
    private String id;

    public int listNo ;
    public String organizationName ;
    public String businessType ;
    public String position ;
    public String workCategory ;
    public Date startDate ;
    public Date endDate ;
    public double newlyRateOfSalary ;
    public String reasonQuit ;
    public String description ;
    private String remark;
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
