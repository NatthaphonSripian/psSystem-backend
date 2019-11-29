package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Fund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<Fund, Long> {
}
