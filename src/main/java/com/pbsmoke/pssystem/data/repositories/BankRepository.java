package com.pbsmoke.pssystem.data.repositories;

import com.pbsmoke.pssystem.data.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
