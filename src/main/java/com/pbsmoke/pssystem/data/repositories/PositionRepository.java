package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
