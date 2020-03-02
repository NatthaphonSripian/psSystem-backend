package com.pbsmoke.pssystem.data.entity.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeReduceTaxDto {

    private long id;
    private String spouseDivide;
    private String spouseReduce;
    private int child;
    private int childNotStudy;
    private double insuranceAmount;
    private double spouseInsuranceAmount;
    private double donationCharity;
    private double donationEducation;
    private double interestLoan;
    private double rmfDeposit;
    private double ltfDeposit;
    private double compensationLaw;
    private double gpfDeposit;
    private double assistInstructor;
    private double fatherIdCardNo;
    private double fatherReduceAmount;
    private double motherIdCardNo;
    private double motherReduceAmount;
    private double fatherHealthInsurance;
    private double motherHealthInsurance;
    private double longInsurance;
    private Boolean isTwoBenefits;
    private String createdBy;
    private Date createdDate;
    private String editBy;
    private Date editDate;
}
