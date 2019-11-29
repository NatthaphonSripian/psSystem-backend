package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Bank;
import com.pbsmoke.pssystem.data.entity.Fund;
import com.pbsmoke.pssystem.service.BankService;
import com.pbsmoke.pssystem.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fund")
public class FundController {

    @Autowired
    private FundService fundService;

    @GetMapping("/all")
    public ResponseEntity<List<Fund>> getBankAll() {
        return new ResponseEntity<>(fundService.fundGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{fundId}")
    public ResponseEntity<Fund> getBankById(@PathVariable("fundId") long fundId) {
        return new ResponseEntity<>(fundService.fundGetById(fundId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Fund> saveBank(@RequestBody Fund fund){
        return new ResponseEntity<>(fundService.fundSave(fund), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{fundId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("fundId") long fundId) {
        fundService.fundDelete(fundId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
