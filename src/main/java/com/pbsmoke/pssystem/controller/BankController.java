package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Bank;
import com.pbsmoke.pssystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/all")
    public ResponseEntity<List<Bank>> getBankAll() {
        return new ResponseEntity<>(bankService.bankGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{bankId}")
    public ResponseEntity<Bank> getBankById(@PathVariable("bankId") String bankId) {
        return new ResponseEntity<>(bankService.bankGetById(Long.parseLong(bankId)), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Bank> saveBank(@RequestBody Bank bank) {
        return new ResponseEntity<>(bankService.bankSave(bank), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bankId}")
    public ResponseEntity<Void> deleteBank(@PathVariable("bankId") String bankId) {
        bankService.bankDelete(Long.parseLong(bankId));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
