package testngclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import com.app.orangehrm.pages.*;

public class TestCreateEmployee {
	
	private String baseUrl = "https://cosmostech-trials65.orangehrmlive.com/auth/login";
	private WebDriver driver;

  @BeforeTest
  public void beforeTest() {
  	driver = new ChromeDriver();
  	driver.manage().window().maximize();
  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  	driver.get(baseUrl);
   
    LoginPage.fillLoginField(driver, "Admin");	
    LoginPage.fillPasswordField(driver, "T9@rZ5nrZA"); 
    LoginPage.clickLogin(driver);
  }
    
  @Test
  public void createEmployee() throws Exception {
  	LeftPanelMenu.clickPIM(driver);
  	Thread.sleep(2000);
  	LeftPanelMenu.clickaddEmployee(driver);
    Thread.sleep(7000);
  	WindowAddEmp.fillFirstName(driver, "Michael");
  	WindowAddEmp.fillLastName(driver, "Huy");
  	WindowAddEmp.clickDropdown(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.clickAU(driver);
  	WindowAddEmp.clickNextButton(driver);
  	Thread.sleep(15000);
  	WindowAddEmp.clickNextButton2(driver);
  	Thread.sleep(15000);
  	WindowAddEmp.clickDropdownRegion(driver);
  	WindowAddEmp.chooseRegionOne(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.clickDropdownFTE(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.chooseZeroPointFive(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.clickDropdownTemp(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.chooseUnitOne(driver);
  	Thread.sleep(2000);
  	WindowAddEmp.clickSaveButton(driver);
  	
  	
  }
 
  
  @AfterTest
  public void afterTest() {
  	//driver.close();
  }

}
