package com.pbsmoke.pssystem.service;

import com.pbsmoke.pssystem.data.entity.Organization;
import com.pbsmoke.pssystem.data.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepo;

    public List<Organization> organizationGetAll() {
        return organizationRepo.findAll();
    }

    public Organization organizationGetById(long organizationId) {
        return organizationRepo.findById(organizationId).orElse(null);
    }

    public Organization organizationSave(Organization organization) {
        return organizationRepo.save(organization);
    }

    public void organizationDelete(long organizationId) {
        organizationRepo.deleteById(organizationId);
    }
}
