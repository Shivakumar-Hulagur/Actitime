package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_Enter_Time_Track {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;

	@FindBy(id="logoutLink")
	private WebElement logout;

	public ActiTIME_Enter_Time_Track(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setTasks()
	{
		tasksTab.click();
	}
	public void setLogout()
	{
		logout.click();
	}
}
