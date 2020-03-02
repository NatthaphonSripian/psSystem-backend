package com.pbsmoke.pssystem.data.entity.dto;

import com.pbsmoke.pssystem.data.entity.IncomeDeduct;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeSocialDto {

    private long id;
    private String isSocialReduce;
    private String socialNo;
    private Date registerDate;
    private String clinic;
    private String isBeforeSocial;
    private String beforeOrganizationName;
    private double beginSocial;
    private double beginIncome;
    private double beginTax;
    private double beginSavingFund;
    private double workerReduce;
    private double employerReduce;
    private double accumulateIncome;
    private double accumulateSocial;
    private double accumulateFunds;
    private double accumulateTax;
    private String reduceType;
    private double paymentPercent;
    private String createdBy;
    private Date createdDate;
    private String editBy;
    private Date editDate;
    private IncomeDeduct incomeDeduct;
}

