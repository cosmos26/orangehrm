package com.app.orangehrm.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.orangehrm.pages.AdminPage;
import com.app.orangehrm.utilities.Driver;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

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
	
	
	@Then("Admin select users {string} && {string} in table")
	public void admin_select_users_in_table(String data1, String data2) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		// PRINT THE USERNAMES OF THE COLUMNS
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		for (WebElement columnName : adminPage.userNameColumns) {
			System.out.println(columnName.getText());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++");

		
		
		
		int numberOFColumns = adminPage.userNameColumns.size();
		
		System.out.println("My table has "+numberOFColumns+" columns");
		
		int columnNumber = 1;
		for (WebElement columnName : adminPage.userNameColumns) {
			if(columnName.getText().equals(data1)) {
				assertTrue(columnName.getText().equals(data1));
				columnNumber++;
				String count="["+columnNumber+"]";
				String locator="(//table[@id='resultTable']//tr//td[1])"+count;
				Driver.getDriver().findElement(By.xpath(locator)).click();
			}
		}
		
		for (WebElement columnName : adminPage.userNameColumns) {
			if(columnName.getText().equals(data2)) {
				assertTrue(columnName.getText().equals(data2));
				columnNumber++;
				String count="["+columnNumber+"]";
				String locator="(//table[@id='resultTable']//tr//td[1])"+count;
				Driver.getDriver().findElement(By.xpath(locator)).click();
			}
		}
		
		
		
	}
}
