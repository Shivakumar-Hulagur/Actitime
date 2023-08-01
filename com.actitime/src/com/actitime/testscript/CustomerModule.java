package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.ActiTIME_Enter_Time_Track;
import com.actitime.pom.ActiTIME_TaskList;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("CreateCustomer",true);
		ActiTIME_Enter_Time_Track a=new ActiTIME_Enter_Time_Track(driver);
		a.setTasks();
		ActiTIME_TaskList at=new ActiTIME_TaskList(driver);
		at.getAddNewBtn().click();
		at.getNewCustomer().click();
		FileLib l=new FileLib();
		String customerName = l.getExcelData("CreateCustomer", 1, 2);
		at.getCustomerName().sendKeys(customerName);
		String custDescription = l.getExcelData("CreateCustomer", 1, 3);
		at.getCustomerDescription().sendKeys(custDescription);
		at.getSelectCustomer().click();
		Thread.sleep(2000);
		at.getBigBangCompany().click();
		at.getCreateCustomer().click();
		Thread.sleep(4000);
		String expectedResult=customerName;
		String actualResult=at.getVerifyCustomer().getText();	
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualResult,expectedResult);
		System.out.println("Expected result:"+expectedResult);
		System.out.println("After creating customer:"+actualResult);
		s.assertAll();

	}

}
