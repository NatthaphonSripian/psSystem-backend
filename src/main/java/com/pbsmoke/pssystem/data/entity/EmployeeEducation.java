package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class EmployeeEducation {

    @javax.persistence.Id
    @GeneratedValue
    private String id;

    private String education;
    private String institution;
    private String qualification;
    private String branch;
    private Date yearEnd;
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
    @JoinColumn(name="employee_id", nullable=false)
    private Employee employee;
}
