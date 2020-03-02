package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.Address;
import com.pbsmoke.pssystem.data.entity.EmployeeSocial;
import com.pbsmoke.pssystem.data.entity.IncomeDeduct;
import com.pbsmoke.pssystem.data.entity.dto.AddressDto;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeSocialDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EmployeeSocialMapper {

    public EmployeeSocialDto mapperEmployeeSocialDto(EmployeeSocial social) {
        EmployeeSocialDto dto = new EmployeeSocialDto();
        if (social != null) {
            dto.setId(social.getId());
            dto.setIsSocialReduce(social.getIsSocialReduce());
            dto.setSocialNo(social.getSocialNo());
            dto.setRegisterDate(social.getRegisterDate());
            dto.setClinic(social.getClinic());
            dto.setIsBeforeSocial(social.getIsBeforeSocial());
            dto.setBeforeOrganizationName(social.getBeforeOrganizationName());
            dto.setBeginSocial(social.getBeginSocial());
            dto.setBeginIncome(social.getBeginIncome());
            dto.setBeginTax(social.getBeginTax());
            dto.setBeginSavingFund(social.getBeginSavingFund());
            dto.setWorkerReduce(social.getWorkerReduce());
            dto.setEmployerReduce(social.getEmployerReduce());
            dto.setAccumulateIncome(social.getAccumulateIncome());
            dto.setAccumulateSocial(social.getAccumulateSocial());
            dto.setAccumulateFunds(social.getAccumulateFunds());
            dto.setAccumulateTax(social.getAccumulateTax());
            dto.setReduceType(social.getReduceType());
            dto.setPaymentPercent(social.getPaymentPercent());
            dto.setIncomeDeduct(null);
//            dto.setCreatedBy(address.getCreatedBy());
//            dto.setCreatedDate(address.getCreatedDate());
//            dto.setEditBy(address.getEditBy());
//            dto.setEditDate(address.getEditDate());
        }
        return dto;
    }
}
