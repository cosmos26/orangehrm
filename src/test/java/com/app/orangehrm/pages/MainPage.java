package com.app.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.orangehrm.utilities.Driver;

public class MainPage {
	private WebDriver driver;
	
	public MainPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]")
	public WebElement pimButton;
	
	@FindBy(xpath="//*[@id=\"menu_pim_addEmployee\"]")
	public WebElement addEmployeeButton;
	
}
