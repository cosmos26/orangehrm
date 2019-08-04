package com.app.orangehrm.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.app.orangehrm.pages.LoginPage;
import com.app.orangehrm.utilities.ConfigurationReader;
import com.app.orangehrm.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Step_Definition {
	LoginPage loginPage = new LoginPage();

	@Given("User should go to login page")
	public void user_should_go_to_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("baseurl"));

	}

	@Given("User enter the username")
	public void user_enter_the_username() {
		// LoginPage.fillLoginField(Driver.getDriver(),
		// ConfigurationReader.getProperty("username"));
		loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));

	}

	@Given("User enter the password")
	public void user_enter_the_password() {
		// LoginPage.fillPasswordField(Driver.getDriver(),
		// ConfigurationReader.getProperty("password"));

		loginPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));
	}

	@Given("User click the login button")
	public void user_click_the_login_button() {
		// LoginPage.clickLogin(Driver.getDriver());

		loginPage.loginButton.click();

	}

	@Then("User can see the Home Page")
	public void user_can_see_the_Home_Page() {
		assertEquals(Driver.getDriver().getTitle(), loginPage.expectedPageTitle);
	}
}
