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
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private String addressType;
    private String addressName;
    private String addressNo;
    private String groupNo;
    private String building;
    private String roomNo;
    private String floorNo;
    private String village;
    private String lane;
    private String street;
    private String district;
    private String amphur;
    private String province;
    private String postalCode;
    private String country;
    private String contactName;
    private String mobilePhone;
    private String phone1;
    private String phone2;
    private String phone3;
    private String fax;
    private String email1;
    private String email2;
    private String Remark;
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
