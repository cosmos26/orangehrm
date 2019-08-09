package com.app.orangehrm.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.app.orangehrm.pages.AdminPage;
import com.app.orangehrm.utilities.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchByUsername_Step_Definition {
	AdminPage adminPage = new AdminPage();
	AddNewUser_Step_Definition addNewUser = new AddNewUser_Step_Definition();
	StringBuilder sb = new StringBuilder();

	@Then("Admin enter an user name {string} in system users module")
	public void admin_enter_an_user_name_in_system_users_module(String string) {

		adminPage.usernameSearchBox.sendKeys(string+AddNewUser_Step_Definition.n);

	}

	@Then("Admin click search button")
	public void admin_click_search_button() {
		adminPage.searchButton.click();
	}

	@Then("User is showed in system users table {string}")
	public void user_is_showed_in_system_users_table(String string) {
		String actualResult = adminPage.usernameInTable.getText();
		System.out.println("Checking username in table "+adminPage.usernameInTable.getText());
		BrowserUtils.waitFor(2);
		assertEquals(string+AddNewUser_Step_Definition.n, actualResult);

	}
}
