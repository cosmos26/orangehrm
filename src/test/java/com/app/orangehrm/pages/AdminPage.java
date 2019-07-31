package com.app.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.orangehrm.utilities.Driver;

public class AdminPage {
	private WebDriver driver;
	private String systemUsersTitleExpect="System Users";
	
	public String getSystemUsersTitleExpect() {
		return systemUsersTitleExpect;
	}

	public AdminPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]")
	public WebElement adminButton;
	
	@FindBy(xpath="//*[@id=\"systemUser-information\"]/div[1]/h1/font/font")
	public WebElement systemUsersTitle;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	public WebElement addButton;
	
	@FindBy(xpath="//*[@id=\"systemUser_userType\"]")
	public WebElement userRole;
	
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public WebElement employeeName;
	
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]")
	public WebElement status;
	
	@FindBy(xpath="//*[@id=\"systemUser_password\"]")
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"systemUser_confirmPassword\"]")
	public WebElement confirmPassowrd;

	@FindBy(xpath="//*[@id=\"btnSave\"]")
	public WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"welcome\"]")
	public WebElement welcomeAdmin;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]")
	public WebElement logoutButton;
	
	
}
