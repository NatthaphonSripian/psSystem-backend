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
public class OrganizationConfigBank {

    @Id
    @GeneratedValue
    private long id;

    private String BankAccount;
    private String BankAccountName;
    private double BankBranch;
    private String createdBy ;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate ;
    private String editBy ;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate ;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    @ManyToOne
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;
}
