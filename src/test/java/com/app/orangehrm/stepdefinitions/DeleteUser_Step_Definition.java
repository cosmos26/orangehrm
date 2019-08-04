package com.app.orangehrm.stepdefinitions;

import com.app.orangehrm.pages.AdminPage;

import cucumber.api.java.en.Then;

public class DeleteUser_Step_Definition {
	AdminPage adminPage = new AdminPage();

	@Then("User select user in the table")
	public void user_select_user_in_the_table() {
		adminPage.selectAllUsersInTable.click();
		if (adminPage.selectAllUsersInTable.isSelected()) {
			System.out.println("Checkbox is Toggled on");
		} else {
			System.out.println("Checkbox is Toggled off");
		}

	}

	@Then("User click delete button")
	public void user_click_delete_button() {
		adminPage.deleteButton.click();
		adminPage.deleteButtonDialogOk.click();
	}
}
