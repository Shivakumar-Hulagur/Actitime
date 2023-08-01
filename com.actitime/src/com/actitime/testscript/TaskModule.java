package com.actitime.testscript;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.ActiTIME_Enter_Time_Track;
import com.actitime.pom.ActiTIME_TaskList;

public class TaskModule extends BaseClass{

	@Test
	public void createTask() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ActiTIME_Enter_Time_Track a=new ActiTIME_Enter_Time_Track(driver);
		a.setTasks();
		ActiTIME_TaskList at=new ActiTIME_TaskList(driver);
		at.getAllCustomer().click();
		at.getAddNewBtn().click();
		at.getNewTasksBtn().click();
		Thread.sleep(4000);
		at.getSelectCustomerForProjectInTaskDD().click();
		Thread.sleep(3000);
		List<WebElement> allCustList = at.getSelectCustomerForTaskList();
		FileLib f=new FileLib();
		for(WebElement e:allCustList)
		{
			if(e.getText().equalsIgnoreCase(f.getExcelData("CreateCustomer", 1, 2)))
			{
				e.click();
				break;
			}
		}
		Thread.sleep(3000);
		at.getSelectProjectForTaskDD().click();
		Thread.sleep(1000);
		List<WebElement> allProjectList = at.getSelectProjectForTaskList();
		for(WebElement e:allProjectList)
		{
			if(e.getText().equalsIgnoreCase(f.getExcelData("CreateProject", 1, 2)))
			{
				e.click();
				break;
			}
		}
		Thread.sleep(1000);
		List<WebElement> allTask = at.getEnterTaskNameForTaskModule();
		int j=2;
		for(WebElement e:allTask)
		{
			e.sendKeys(f.getExcelData("CreateTask", 1,j));
			j++;
		}		
		at.getCreateTaskBtn().click();
		Thread.sleep(5000);
		String actualTaskOfCustomer=at.getActualCustomerCreatedForTaskModule().getText();
		String expectedTaskOfCustomer=f.getExcelData("CreateCustomer", 1, 2);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTaskOfCustomer,expectedTaskOfCustomer);
	}
}
