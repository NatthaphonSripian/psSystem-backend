package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Bank;
import com.pbsmoke.pssystem.data.entity.Organization;
import com.pbsmoke.pssystem.data.repositories.BankRepository;
import com.pbsmoke.pssystem.data.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;

    public List<Bank> bankGetAll() {
        return bankRepository.findAll();
    }

    public Bank bankGetById(long bankId) {
        return bankRepository.findById(bankId).orElse(null);
    }

    public Bank bankSave(Bank bank) {
        return bankRepository.save(bank);
    }

    public void bankDelete(long bankId) {
        bankRepository.deleteById(bankId);
    }
}
