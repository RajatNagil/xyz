/*package com.cg.payroll.test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUtil;
public class PayrollServicesTest {
	private static PayrollServices services;
	@BeforeClass
	public static void setUpTestEnv() {
		services=new PayrollServicesImpl();
	}
	@Before
	public void setUpTestData() {
		Associate associate1=new Associate(101, 50000, "Rajat", "nagil", "IT", "ANAlyst", "BTA45454PS", "rajat@gmail.com",
				new Salary(120000, 5000, 4500),new BankDetails(123456, "Axis", "UTI4578"));
		Associate associate2=new Associate(102, 45000, "Ekta", "Sharma", "IT", "ANAlyst", "BTA4553PS", "rajat@gmail.com",
				new Salary(120000, 5000, 4500),new BankDetails(123457, "Axis", "UTI4578"));
		PayrollDBUtil.associates.put(associate1.getAssociateId(), associate1);
		PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testGetAssociateDetailForInvalidAssociateId() throws AssociateDetailsNotFoundException {
		services.getAssociateDetails(12343);
	}
	@Test
	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailsNotFoundException{
		Associate expectedAssociate=new Associate(101, 50000, "Rajat", "nagil", "IT", "ANAlyst", "BTA45454PS", "rajat@gmail.com",
				new Salary(120000, 5000, 4500),new BankDetails(123456, "Axis", "UTI4578"));
		Associate actualAssociate= services.getAssociateDetails(101);
		Assert.assertEquals(expectedAssociate, actualAssociate);
	}
	
	@Test
	public void testAcceptAssociateDetailsForValidData() {
		int expectedId=103;
		int actualId=services.acceptAssociateDetails("rajat", "nagh", "jahgs@.com", "wqe","wqe", "qwe456",5000, 12000, 2000, 2000, 12456, "Axis", "asd123");
		Assert.assertEquals(expectedId, actualId);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailsNotFoundException{
		services.calculateNetSalary(1434);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailsNotFoundException{
		int expectedNetSalary=0;
		int actualNetSalary=services.calculateNetSalary(102);
		Assert.assertEquals(expectedNetSalary, actualNetSalary);
	}
	@Test
	public void testGetAllAssociateDetails() {
		Associate associate1=new Associate(101, 50000, "Rajat", "nagil", "IT", "ANAlyst", "BTA45454PS", "rajat@gmail.com",
				new Salary(120000, 5000, 4500),new BankDetails(123456, "Axis", "UTI4578"));
		Associate associate2=new Associate(102, 45000, "Ekta", "Sharma", "IT", "ANAlyst", "BTA4553PS", "rajat@gmail.com",
				new Salary(120000, 5000, 4500),new BankDetails(123457, "Axis", "UTI4578"));
		ArrayList<Associate> expectedAssociateList=new ArrayList<>();
		expectedAssociateList.add(associate1);
		expectedAssociateList.add(associate2);
		ArrayList<Associate>actualAssociateList=(ArrayList<Associate>)services.getAllAssociatesDetails();
		Assert.assertEquals(expectedAssociateList, actualAssociateList);
	}
	@After
	public void tearDownTestData() {
			PayrollDBUtil.associates.clear();
			PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
		}
	@AfterClass
	public static void TearDownTestEnv() {
		services=null;
	}
}*/