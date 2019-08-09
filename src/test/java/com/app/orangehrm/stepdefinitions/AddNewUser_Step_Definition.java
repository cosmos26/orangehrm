package com.app.orangehrm.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;

import com.app.orangehrm.pages.AdminPage;
import com.app.orangehrm.pages.LoginPage;
import com.app.orangehrm.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewUser_Step_Definition {
	LoginPage loginPage = new LoginPage();
	AdminPage adminPage = new AdminPage();
	static Random random = new Random();
	static int n = random.nextInt(500);
	StringBuilder sb = new StringBuilder();

	@Given("Admin click Admin button")
	public void admin_click_Admin_button() {
		adminPage.adminButton.click();
	}

	/**
	 * This method can be improved !!
	 * 
	 * @author Halil
	 */
	@When("Page shows System Users module")
	public void page_shows_System_Users_module() {
		assertTrue(adminPage.addButton.isDisplayed());
	}

	@Then("Admin click add button")
	public void admin_click_add_button() {
		adminPage.addButton.click();
	}

	@Then("Admin select user role as ESS")
	public void admin_select_user_role_as_ESS() {
		adminPage.userRole.isSelected();
	}

	@Then("Admin enter an employee name {string}")
	public void admin_enter_an_employee_name(String string) {
		adminPage.employeeName.sendKeys(string);
	}

	/**
	 * We should generate different username for each time!!
	 * 
	 * @author Halil
	 * @param string
	 */
	@Then("Admin enter an user name {string}")
	public void admin_enter_an_user_name(String string) {
		sb.append(string+n);
		adminPage.userName.sendKeys(sb);

	}

	@Then("Admin select status as enabled")
	public void admin_select_status_as_enabled() {
		adminPage.status.isSelected();
	}

	@Then("Admin enter a password {string}")
	public void admin_enter_a_password(String string) {
		adminPage.password.sendKeys(string);
	}

	@Then("Admin confirm the password {string}")
	public void admin_confirm_the_password(String string) {
		adminPage.confirmPassowrd.sendKeys(string);
	}

	@Then("Admin click save button")
	public void admin_click_save_button() {
		adminPage.saveButton.click();
	}

	/**
	 * expected result may be different each time beacuse language can be English,
	 * French or Chinese
	 */
	@Then("Page shows Welcome Admin type")
	public void page_shows_Welcome_Admin_type() {
		BrowserUtils.waitFor(2);
		System.out.println(adminPage.welcomeAdmin.getText());
		assertEquals("Welcome Admin", adminPage.welcomeAdmin.getText());

	}

	@Given("Admin should logout")
	public void admin_should_logout() {
		adminPage.welcomeAdmin.click();
		adminPage.logoutButton.click();
	}

	@Given("User enter the username {string}")
	public void user_enter_the_username(String string) {
		System.out.println(string + n);
		loginPage.userName.sendKeys(string + n);
	}

	@Given("User enter the password {string}")
	public void user_enter_the_password(String string) {
		loginPage.passWord.sendKeys(string);
	}

	@Then("Page shows Welcome Linda type")
	public void page_shows_Welcome_Linda_type() {
		BrowserUtils.waitFor(2);
		System.out.println(adminPage.welcomeAdmin.getText());
		assertEquals("Welcome Linda", adminPage.welcomeAdmin.getText());
	}

}
