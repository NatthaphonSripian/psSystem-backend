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
public class Bank {

    @Id
    @GeneratedValue
    private long id;

    public String bankCode;
    public String bankNameTh;
    public String bankNameEn;
    public String bankShortName;
    public String remark;

    private String createdBy;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate;
    private String editBy;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bank")
    private OrganizationConfigBank organizationConfigBank;
}
