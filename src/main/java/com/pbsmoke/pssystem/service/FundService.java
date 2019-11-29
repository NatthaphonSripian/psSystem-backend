package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Fund;
import com.pbsmoke.pssystem.data.repositories.FundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundService {

    @Autowired
    private FundRepository fundRepository;

    public List<Fund> fundGetAll() {
        return fundRepository.findAll();
    }

    public Fund fundGetById(long fundId) {
        return fundRepository.findById(fundId).orElse(null);
    }

    public Fund fundSave(Fund fund) {
        return fundRepository.save(fund);
    }

    public void fundDelete(long fundId) {
        fundRepository.deleteById(fundId);
    }
}
