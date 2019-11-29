package com.pbsmoke.pssystem.data.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Organization {

    @Id
    @GeneratedValue
    private long id;
    private String orgCode ;
    private String orgName ;
    private String orgNameEng ;
    private String orgBranchTax ;
    private String orgTaxId ;
    private String orgBranchSoc ;
    private String orgSocId ;
    private String orgFundCode ;
    private String addressName ;
    private String addressNo ;
    private String groupNo ;
    private String building ;
    private String roomNo ;
    private String floorNo ;
    private String village ;
    private String lane ;
    private String street ;
    private String district ;
    private String amphur ;
    private String province ;
    private String postalCode ;
    private String country ;
    private String contactName ;
    private String mobilePhone ;
    private String phone1 ;
    private String phone2 ;
    private String phone3 ;
    private String fax ;
    private String email ;
    private String website ;
    private String remark ;
    private String createdBy ;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate ;

    private String editBy ;

    @Column(nullable = false)
    @LastModifiedDate
    private Date editDate ;

    private String orgLogoId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "organization")
    private OrganizationConfig organizationConfig;

    @OneToMany(mappedBy="organization")
    private List<OrganizationConfigFund> organizationConfigFunds;

    @OneToMany(mappedBy="organization" , fetch = FetchType.LAZY)
    private List<Department> departments;

    @OneToMany(mappedBy="organization", fetch = FetchType.LAZY)
    private List<EmployeeEmployment> employeeEmployments;
}
