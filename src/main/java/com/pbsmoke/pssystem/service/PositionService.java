package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Bank;
import com.pbsmoke.pssystem.data.entity.Position;
import com.pbsmoke.pssystem.data.repositories.BankRepository;
import com.pbsmoke.pssystem.data.repositories.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public List<Position> positionGetAll() {
        return positionRepository.findAll();
    }

    public Position positionGetById(long positionId) {
        return positionRepository.findById(positionId).orElse(null);
    }

    public Position positionSave(Position position) {
        return positionRepository.save(position);
    }

    public void positionDelete(long positionId) {
        positionRepository.deleteById(positionId);
    }
}
