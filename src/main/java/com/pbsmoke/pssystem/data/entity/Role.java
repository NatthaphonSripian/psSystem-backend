package com.pbsmoke.pssystem.data.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Role {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<Users> users;
}
