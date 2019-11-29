package com.pbsmoke.pssystem.controller;

import com.pbsmoke.pssystem.data.entity.Organization;
import com.pbsmoke.pssystem.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping("/all")
    public ResponseEntity<List<Organization>> getOrganizationAll() {
        return new ResponseEntity<>(organizationService.organizationGetAll(), HttpStatus.OK);
    }

    @GetMapping("/{organizationId}")
    public ResponseEntity<Organization> getOrganizationById(@PathVariable("organizationId") long organizationId) {
        return new ResponseEntity<>(organizationService.organizationGetById(organizationId), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Organization> saveOrganization(@RequestBody Organization organization){
        return new ResponseEntity<>(organizationService.organizationSave(organization), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteOrganization(@PathVariable("organizationId") long organizationId) {
        organizationService.organizationDelete(organizationId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
