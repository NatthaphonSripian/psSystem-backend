package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.EmployeeReduceTax;
import com.pbsmoke.pssystem.data.entity.dto.EmployeeReduceTaxDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeReduceTaxMapper {

    public EmployeeReduceTaxDto mapperEmployeeReduceTaxDto(EmployeeReduceTax reduceTax) {
        EmployeeReduceTaxDto dto = new EmployeeReduceTaxDto();
        if (reduceTax != null) {
            dto.setId(reduceTax.getId());
            dto.setSpouseDivide(reduceTax.getSpouseDivide());
            dto.setSpouseReduce(reduceTax.getSpouseReduce());
            dto.setChild(reduceTax.getChild());
            dto.setChildNotStudy(reduceTax.getChildNotStudy());
            dto.setInsuranceAmount(reduceTax.getInsuranceAmount());
            dto.setSpouseInsuranceAmount(reduceTax.getSpouseInsuranceAmount());
            dto.setDonationCharity(reduceTax.getDonationCharity());
            dto.setDonationEducation(reduceTax.getDonationEducation());
            dto.setInterestLoan(reduceTax.getInterestLoan());
            dto.setRmfDeposit(reduceTax.getRmfDeposit());
            dto.setLtfDeposit(reduceTax.getLtfDeposit());
            dto.setCompensationLaw(reduceTax.getCompensationLaw());
            dto.setGpfDeposit(reduceTax.getGpfDeposit());
            dto.setAssistInstructor(reduceTax.getAssistInstructor());
            dto.setFatherIdCardNo(reduceTax.getFatherIdCardNo());
            dto.setFatherReduceAmount(reduceTax.getFatherReduceAmount());
            dto.setMotherIdCardNo(reduceTax.getMotherIdCardNo());
            dto.setMotherReduceAmount(reduceTax.getMotherReduceAmount());
            dto.setFatherHealthInsurance(reduceTax.getFatherHealthInsurance());
            dto.setMotherHealthInsurance(reduceTax.getMotherHealthInsurance());
            dto.setLongInsurance(reduceTax.getLongInsurance());
            dto.setIsTwoBenefits(reduceTax.getIsTwoBenefits());
//            dto.setCreatedBy(address.getCreatedBy());
//            dto.setCreatedDate(address.getCreatedDate());
//            dto.setEditBy(address.getEditBy());
//            dto.setEditDate(address.getEditDate());
        }
        return dto;
    }
}
