package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.EmployeeLevel;
import com.pbsmoke.pssystem.data.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeLevelRepository extends JpaRepository<EmployeeLevel, Long> {
}
