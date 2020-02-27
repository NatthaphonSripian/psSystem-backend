package com.pbsmoke.pssystem.EntityTest;

import com.pbsmoke.pssystem.data.entity.*;
import com.pbsmoke.pssystem.data.repositories.*;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@Log4j2
class EntityTests {

    @Autowired
    EmployeeLevelRepository employeeLevelRepository;

    @Autowired
    EmployeeGroupRepository employeeGroupRepository;

    @Autowired
    PositionRepository positionRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
	BankRepository bankRepository;

    @Autowired
	FundRepository fundRepository;

    @Test
    void A_Employee_Level_Data() {
        EmployeeLevel employeeLevel = new EmployeeLevel();
        employeeLevel.setEmployeeLevelCode("L-0001");
        employeeLevel.setEmployeeLevelNameEn("General Level");
        employeeLevel.setEmployeeLevelNameTh("ระดับพนักงานทั่วไป");
        employeeLevelRepository.save(employeeLevel);
        log.info(employeeLevel);
        assertTrue(employeeLevel.getEmployeeLevelCode().equalsIgnoreCase("L-0001"));

        employeeLevel = new EmployeeLevel();
        employeeLevel.setEmployeeLevelCode("L-0002");
        employeeLevel.setEmployeeLevelNameEn("Senior Level");
        employeeLevel.setEmployeeLevelNameTh("ระดับหัวหน้างาน");
        employeeLevelRepository.save(employeeLevel);
        log.info(employeeLevel);
        assertTrue(employeeLevel.getEmployeeLevelCode().equalsIgnoreCase("L-0002"));

        employeeLevel = new EmployeeLevel();
        employeeLevel.setEmployeeLevelCode("L-0003");
        employeeLevel.setEmployeeLevelNameEn("Managing Level");
        employeeLevel.setEmployeeLevelNameTh("ระดับบริหารงาน");
        employeeLevelRepository.save(employeeLevel);
        log.info(employeeLevel);
        assertTrue(employeeLevel.getEmployeeLevelCode().equalsIgnoreCase("L-0003"));


        List<EmployeeLevel> employeeLevelList = employeeLevelRepository.findAll();
        log.info(employeeLevelList);
        assertEquals(employeeLevelList.size(), 3);
    }

    @Test
    void B_Employee_Group_Data() {
        EmployeeGroup employeeGroup = new EmployeeGroup();
        employeeGroup.setEmployeeGroupCode("G-0001");
        employeeGroup.setEmployeeGroupNameEn("Thai Person Group");
        employeeGroup.setEmployeeGroupNameTh("กลุ่มพนักงานคนไทย");
        employeeGroupRepository.save(employeeGroup);
        log.info(employeeGroup);
        assertTrue(employeeGroup.getEmployeeGroupCode().equalsIgnoreCase("G-0001"));

        employeeGroup = new EmployeeGroup();
        employeeGroup.setEmployeeGroupCode("G-0002");
        employeeGroup.setEmployeeGroupNameEn("Janpanese  Group");
        employeeGroup.setEmployeeGroupNameTh("กลุ่มพนักงานชาวญี่ปุ่น");
        employeeGroupRepository.save(employeeGroup);
        log.info(employeeGroup);
        assertTrue(employeeGroup.getEmployeeGroupCode().equalsIgnoreCase("G-0002"));

        employeeGroup = new EmployeeGroup();
        employeeGroup.setEmployeeGroupCode("G-0003");
        employeeGroup.setEmployeeGroupNameEn("Trainee Group");
        employeeGroup.setEmployeeGroupNameTh("นักศึกษาฝึกงาน");
        employeeGroupRepository.save(employeeGroup);
        log.info(employeeGroup);
        assertTrue(employeeGroup.getEmployeeGroupCode().equalsIgnoreCase("G-0003"));


        List<EmployeeGroup> employeeGroupList = employeeGroupRepository.findAll();
        log.info(employeeGroupList);
        assertEquals(employeeGroupList.size(), 3);
    }

    @Test
    void C_Position_Data() {
        Position position = new Position();
        position.setPositionCode("P-0001");
        position.setPositionNameEn("Managing Director");
        position.setPositionNameTh("กรรมการผู้จัดการ");
        positionRepository.save(position);
        assertEquals(position.getPositionCode(), "P-0001");

        position = new Position();
        position.setPositionCode("P-0002");
        position.setPositionNameEn("Sale & Marketing Mgr.");
        position.setPositionNameTh("ผู้จัดการฝ่ายขายและการตลาด");
        positionRepository.save(position);
        assertEquals(position.getPositionCode(), "P-0002");

        position = new Position();
        position.setPositionCode("P-0003");
        position.setPositionNameEn("Developer Mgr.");
        position.setPositionNameTh("ผู้จัดการฝ่ายผู้พัฒนาผลิตภัณฑ์");
        positionRepository.save(position);
        assertEquals(position.getPositionCode(), "P-0003");

        position = new Position();
        position.setPositionCode("P-0004");
        position.setPositionNameEn("Accounting & Financial Mgr.");
        position.setPositionNameTh("ผู้จัดการฝ่ายบัญชีและการเงิน");
        positionRepository.save(position);
        assertEquals(position.getPositionCode(), "P-0004");

        position = new Position();
        position.setPositionCode("P-0005");
        position.setPositionNameEn("Human Resources & administration Mgr.");
        position.setPositionNameTh("ผู้จัดการฝ่ายบุคคลและธุรการ");
        positionRepository.save(position);
        assertEquals(position.getPositionCode(), "P-0005");

        List<Position> positionList = positionRepository.findAll();
        log.info(positionList);
        assertEquals(positionList.size(), 5);
    }

    @Test
    void D_Department_Data() {

        Department department = new Department();
        department.setDepartmentCode("D-0001");
        department.setDepartmentNameEn("Manage Dept.");
        department.setDepartmentNameTh("ฝ่ายบริหาร");
        departmentRepository.save(department);
        assertEquals(department.getDepartmentCode(), "D-0001");

        department = new Department();
        department.setDepartmentCode("D-0002");
        department.setDepartmentNameEn("Sale & Marketing Dept.");
        department.setDepartmentNameTh("ฝ่ายขายและการตลาด");
        departmentRepository.save(department);
        assertEquals(department.getDepartmentCode(), "D-0002");

        department = new Department();
        department.setDepartmentCode("D-0003");
        department.setDepartmentNameEn("Developer Dept.");
        department.setDepartmentNameTh("ฝ่ายผู้พัฒนาผลิตภัณฑ์");
        departmentRepository.save(department);
        assertEquals(department.getDepartmentCode(), "D-0003");

        department = new Department();
        department.setDepartmentCode("D-0004");
        department.setDepartmentNameEn("Accounting & Financial Dept.");
        department.setDepartmentNameTh("ฝ่ายบัญชีและการเงิน");
        departmentRepository.save(department);
        assertEquals(department.getDepartmentCode(), "D-0004");

        department = new Department();
        department.setDepartmentCode("D-0005");
        department.setDepartmentNameEn("Human Resources & Administration Dept.");
        department.setDepartmentNameTh("ฝ่ายบุคคลและธุรการ");
        departmentRepository.save(department);
        assertEquals(department.getDepartmentCode(), "D-0005");

        List<Department> departmentList = departmentRepository.findAll();
        log.info(departmentList);
        assertEquals(departmentList.size(), 5);
    }

    @Test
	void E_Bank_Data(){
		Bank bank = new Bank();
		bank.setBankCode("KBANK");
		bank.setBankNameEn("KasikornBank");
		bank.setBankNameTh("ธนาคารกสิกรไทย");
		bank.setBankShortName("KBank");
		bankRepository.save(bank);
		assertEquals(bank.getBankCode(),"KBANK");

		bank = new Bank();
		bank.setBankCode("KTB");
		bank.setBankNameEn("Krungthai Bank");
		bank.setBankNameTh("กรุงไทย");
		bank.setBankShortName("KTB");
		bankRepository.save(bank);
		assertEquals(bank.getBankCode(),"KTB");

		bank = new Bank();
		bank.setBankCode("SCB");
		bank.setBankNameEn("Siam Commercial Bank");
		bank.setBankNameTh("ธนาคารไทยพาณิชย์");
		bank.setBankShortName("SCB");
		bankRepository.save(bank);
		assertEquals(bank.getBankCode(),"SCB");

		List<Bank> bankList = bankRepository.findAll();
		log.info(bankList);
		assertEquals(bankList.size(), 3);
	}

	@Test
	void F_Fund_Data(){

    	Fund fund = new Fund();
    	fund.setFundCode("M0000_2552");
    	fund.setFundNameEn("MFC Hi-Dividend Fund");
    	fund.setFundNameTh("กองทุนเปิดเอ็มเอฟซี ไฮ-ดิวิเดนด์ ฟันด์");
    	fund.setFundShortName("THF");
    	fundRepository.save(fund);
    	assertEquals(fund.getFundCode(),"M0000_2552");

		fund = new Fund();
		fund.setFundCode("001");
		fund.setFundNameEn("Tisco Provedent Punds");
		fund.setFundNameTh("กองทุนทิสโก้");
		fund.setFundShortName("TISCO");
		fundRepository.save(fund);
		assertEquals(fund.getFundCode(),"001");

		List<Fund> fundList = fundRepository.findAll();
		log.info(fundList);
		assertEquals(fundList.size(), 2);
	}


}
