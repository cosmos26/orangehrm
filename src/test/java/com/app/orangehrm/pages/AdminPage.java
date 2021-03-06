package com.app.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.app.orangehrm.utilities.Driver;

public class AdminPage {
	private WebDriver driver;
	private String systemUsersTitleExpect = "System Users";

	public String getSystemUsersTitleExpect() {
		return systemUsersTitleExpect;
	}

	public AdminPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page object below
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]")
	public WebElement adminButton;

	@FindBy(xpath = "//*[@id=\"systemUser-information\"]/div[1]/h1/font/font")
	public WebElement systemUsersTitle;

	@FindBy(xpath = "//*[@id=\"searchSystemUser_userName\"]")
	public WebElement usernameSearchBox;

	@FindBy(xpath = "//*[@id=\"searchBtn\"]")
	public WebElement searchButton;

	@FindBy(xpath = "//*[@id=\"btnDelete\"]")
	public WebElement deleteButton;

	@FindBy(xpath = "//*[@id=\"dialogDeleteBtn\"]")
	public WebElement deleteButtonDialogOk;

	@FindBy(xpath = "//table[@id='resultTable']//td[2]")
	public WebElement usernameInTable;

	@FindBy(xpath = "//table[@id='resultTable']//th[1]")
	public WebElement selectUsersInTable;

	@FindBy(xpath = "//*[@name=\"chkSelectAll\"]")
	public WebElement selectAllUsersInTable;

	@FindBy(xpath = "//*[@id=\"btnAdd\"]")
	public WebElement addButton;

	@FindBy(xpath = "//*[@id=\"systemUser_userType\"]")
	public WebElement userRole;

	@FindBy(xpath = "//*[@id=\"systemUser_employeeName_empName\"]")
	public WebElement employeeName;

	@FindBy(xpath = "//*[@id=\"systemUser_userName\"]")
	public WebElement userName;

	@FindBy(xpath = "//*[@id=\"systemUser_status\"]")
	public WebElement status;

	@FindBy(xpath = "//*[@id=\"systemUser_password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"systemUser_confirmPassword\"]")
	public WebElement confirmPassowrd;

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	public WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	public WebElement welcomeAdmin;

	@FindBy(linkText = "Logout")
	public WebElement logoutButton;

	public List<WebElement> userNameColumns = Driver.getDriver().findElements(By.xpath("//table[@id='resultTable']//tr//td[2]"));

	public List<WebElement> checkBoxColumns = Driver.getDriver().findElements(By.xpath("//table[@id='resultTable']//tr//td[1]"));
}
