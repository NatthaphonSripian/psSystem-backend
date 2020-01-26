package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Employee;
import com.pbsmoke.pssystem.data.entity.EmployeeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
