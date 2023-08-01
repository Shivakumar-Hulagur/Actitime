package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_Login {
@FindBy(id="username")
private WebElement untbx;

@FindBy(name="pwd")
private WebElement pwdtbx;

@FindBy(xpath="//div[text()='Login ']")
private WebElement lgBtn;

public ActiTIME_Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);	
}

public void setLogin(String un,String pwd)
{
	untbx.sendKeys(un);
	pwdtbx.sendKeys(pwd);
	lgBtn.click();	
}
}
