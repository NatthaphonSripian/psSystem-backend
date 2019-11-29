package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
