package com.app.orangehrm.testngclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import com.app.orangehrm.pages.*;
import com.app.orangehrm.utilities.BrowserUtils;
import com.app.orangehrm.utilities.ConfigurationReader;
import com.app.orangehrm.utilities.Driver;

public class TestCreateEmployee {
	
	//private String baseUrl = "https://cosmostech-trials65.orangehrmlive.com/auth/login";
	//private WebDriver driver;

  @BeforeTest
  public void beforeTest() {
  	//driver = new ChromeDriver();
  	Driver.getDriver().manage().window().maximize();
  	Driver.getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  	Driver.getDriver().get(ConfigurationReader.getProperty("baseurl"));
   
    LoginPage.fillLoginField(Driver.getDriver(), ConfigurationReader.getProperty("username"));	
    LoginPage.fillPasswordField(Driver.getDriver(), ConfigurationReader.getProperty("password")); 
    LoginPage.clickLogin(Driver.getDriver());
  }
    
  @Test
  public void createEmployee() throws Exception {
  	LeftPanelMenu.clickPIM(Driver.getDriver());
  	BrowserUtils.waitForClickablility(LeftPanelMenu.element, 3);
  	LeftPanelMenu.clickaddEmployee(Driver.getDriver());
  
    BrowserUtils.waitForVisibility(By.id("firstName"), 10);
  	WindowAddEmp.fillFirstName(Driver.getDriver(), "Michael");
  	WindowAddEmp.fillLastName(Driver.getDriver(), "Huy");
  	WindowAddEmp.clickDropdown(Driver.getDriver());
  	BrowserUtils.waitForVisibility(WindowAddEmp.element, 5);
  	WindowAddEmp.clickAU(Driver.getDriver());
  	WindowAddEmp.clickNextButton(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.clickNextButton2(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.clickDropdownRegion(Driver.getDriver());
  	WindowAddEmp.chooseRegionOne(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.clickDropdownFTE(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.chooseZeroPointFive(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.clickDropdownTemp(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.chooseUnitOne(Driver.getDriver());
  	Thread.sleep(5000);
  	WindowAddEmp.clickSaveButton(Driver.getDriver()); 	 	
  }
   
  @AfterTest
  public void afterTest() {
  	Driver.getDriver().close();
  }

}
