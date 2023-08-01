package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_TaskList {
	
	@FindBy(xpath="(//div[text()='All Customers'])[1]")
	private WebElement allCustomer;

	public WebElement getAllCustomer() {
		return allCustomer;
	}

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerName;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomer;

	@FindBy(xpath="//div[text()='Big Bang Company'and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreateCustomer;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement verifyCustomer;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement enterProjectNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomerForProjectDD;
	
	@FindBy(xpath="//div[@class='customerLabel']/../../..//div[@class='itemRow cpItemRow ']")
	private List<WebElement> customersListForProject;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescriptionTextArea;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actulaProjectNameLocation;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newTasksBtn;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/..//div[@class='dropdownButton']")
	private WebElement selectCustomerForProjectInTaskDD;
	
	@FindBy(xpath="//div[@class='searchItemList']/..//div[@class='itemRow cpItemRow ']")
	private List<WebElement> selectCustomerForTaskList;
	
	@FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']/..//div[@class='dropdownButton']")
	private WebElement selectProjectForTaskDD;
	
	@FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='itemRow cpItemRow ']")
	private List<WebElement> selectProjectForTaskList;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
	private List<WebElement> enterTaskNameForTaskModule;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	
	@FindBy(xpath = "//div[@class='topContainer']/..//div[@class='title']")
	private WebElement actualCustomerCreatedForTaskModule;
	
	
	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getEnterProjectNameTbx() {
		return enterProjectNameTbx;
	}

	public WebElement getSelectCustomerForProjectInTaskDD() {
		return selectCustomerForProjectInTaskDD;
	}

	public List<WebElement> getSelectCustomerForTaskList() {
		return selectCustomerForTaskList;
	}

	public WebElement getSelectProjectForTaskDD() {
		return selectProjectForTaskDD;
	}

	public List<WebElement> getSelectProjectForTaskList() {
		return selectProjectForTaskList;
	}

	public List<WebElement> getEnterTaskNameForTaskModule() {
		return enterTaskNameForTaskModule;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

	public WebElement getActualCustomerCreatedForTaskModule() {
		return actualCustomerCreatedForTaskModule;
	}

	public WebElement getSelectCustomerForProjectDD() {
		return selectCustomerForProjectDD;
	}

	public List<WebElement> getCustomersListForProject() {
		return customersListForProject;
	}

	public WebElement getAddProjectDescriptionTextArea() {
		return addProjectDescriptionTextArea;
	}

	public WebElement getEnterTaskTbx() {
		return enterTaskTbx;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActulaProjectNameLocation() {
		return actulaProjectNameLocation;
	}

	public WebElement getNewTasksBtn() {
		return newTasksBtn;
	}

	public ActiTIME_TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomer() {
		return CreateCustomer;
	}

	public WebElement getVerifyCustomer() {
		return verifyCustomer;
	}


}
