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
public class OrganizationConfigFund {

    @Id
    @GeneratedValue
    private long id;

    private String fundAccount;
    private double fundRate;
    private String createdBy ;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate ;
    private String editBy ;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate ;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fund_id", nullable = false)
    private Fund fund;

    @ManyToOne
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;
}
