package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Position;
import com.pbsmoke.pssystem.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/all")
    public ResponseEntity<List<Position>> getBankAll() {
        return new ResponseEntity<>(positionService.positionGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{positionId}")
    public ResponseEntity<Position> getBankById(@PathVariable("positionId") long positionId) {
        return new ResponseEntity<>(positionService.positionGetById(positionId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Position> saveBank(@RequestBody Position position) {
        return new ResponseEntity<>(positionService.positionSave(position), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{positionId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("positionId") long positionId) {
        positionService.positionDelete(positionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
