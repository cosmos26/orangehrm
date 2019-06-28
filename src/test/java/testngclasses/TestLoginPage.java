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
import com.app.orangehrm.pages.LoginPage;
import com.app.orangehrm.utilities.ConfigurationReader;
import com.app.orangehrm.utilities.Driver;

public class TestLoginPage {
	
	//private String baseUrl = "https://cosmostech-trials65.orangehrmlive.com/auth/login";
	

  @BeforeTest
  public void beforeTest() {
	  
	  Driver.getDriver().manage().window().maximize();
	  Driver.getDriver().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  Driver.getDriver().get(ConfigurationReader.getProperty("baseurl"));
  }
  
  @Test
  public void login() {
  	LoginPage.fillLoginField(Driver.getDriver(), ConfigurationReader.getProperty("username"));
  	LoginPage.fillPasswordField(Driver.getDriver(), ConfigurationReader.getProperty("password")); 
  	LoginPage.clickLogin(Driver.getDriver());
  }
  
  @AfterTest
  public void afterTest() {
	  Driver.getDriver().close();
  }

}
