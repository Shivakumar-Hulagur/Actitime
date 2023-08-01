package com.actitime.testscript;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.ActiTIME_Enter_Time_Track;
import com.actitime.pom.ActiTIME_TaskList;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void CreateProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ActiTIME_Enter_Time_Track a=new ActiTIME_Enter_Time_Track(driver);
		a.setTasks();
		ActiTIME_TaskList t=new ActiTIME_TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewProject().click();
		FileLib f=new FileLib();
		String projectname = f.getExcelData("CreateProject", 1, 2);
		t.getEnterProjectNameTbx().sendKeys(projectname);
		t.getSelectCustomerForProjectDD().click();
		List<WebElement> customerList = t.getCustomersListForProject();
		for(WebElement e:customerList)
		{
			if(e.getText().equalsIgnoreCase(f.getExcelData("CreateCustomer", 1, 2)))
			e.click();
			
		}
		t.getAddProjectDescriptionTextArea().sendKeys(f.getExcelData("CreateProject", 1, 4));
		t.getEnterTaskTbx().sendKeys(f.getExcelData("CreateProject", 1, 5));
		t.getCreateProjectBtn().click();
		Thread.sleep(4000);
		String expectedProjectName=projectname;
		String actualProjectName = t.getActulaProjectNameLocation().getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualProjectName,expectedProjectName);
	}
}
