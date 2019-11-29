package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Users {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    @NotEmpty()
    private String username;
    @Column(nullable=false)
    @NotEmpty
    @Size(min=4)
    private String password;

    private String createdBy ;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdDate ;
    private String editBy ;
    @LastModifiedDate
    @Column(nullable = false)
    private Date editDate ;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="users_role",
            joinColumns={@JoinColumn(name="USERS_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles;
}
