package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class OrganizationConfigDayPerMonth {

    @Id
    @GeneratedValue
    private long id;
    private String monthNameTh ;
    private String monthNameEn ;
    private long monthNumber ;
    private long DayOfMonth ;
    private long DayOfOrg ;

    @ManyToOne
    @JoinColumn(name="organization_config_id", nullable=false)
    private OrganizationConfig organizationConfig;

}
