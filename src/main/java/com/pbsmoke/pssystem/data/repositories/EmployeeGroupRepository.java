package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import com.pbsmoke.pssystem.data.entity.EmployeeLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeGroupRepository extends JpaRepository<EmployeeGroup, Long> {
}
