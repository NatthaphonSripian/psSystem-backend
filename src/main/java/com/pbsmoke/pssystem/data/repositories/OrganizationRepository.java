package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
