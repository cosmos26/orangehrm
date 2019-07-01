package com.app.orangehrm.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.app.orangehrm.pages.MainPage;
import com.app.orangehrm.pages.WindowAddEmployeePage;
import com.app.orangehrm.utilities.BrowserUtils;
import com.app.orangehrm.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Employee_Step_Definition {
	MainPage mainPage = new MainPage();
	WindowAddEmployeePage addEmployeePage= new WindowAddEmployeePage();
	
	@Then("User click PIM button")
	public void user_click_PIM_button() {
		mainPage.pimButton.click();
	}

	@Then("User click Add Employee button")
	public void user_click_Add_Employee_button() {
		mainPage.addEmployeeButton.click();
	}

	@Then("User enter employee data {string} {string} and location")
	public void user_enter_employee_data_and_location(String string, String string2) {
	    BrowserUtils.waitForVisibility(addEmployeePage.firstName, 10);
		addEmployeePage.firstName.sendKeys(string);
		
	    addEmployeePage.lastName.sendKeys(string2);
	    addEmployeePage.locationDropDown.click();
	    addEmployeePage.newYorkSalesOffice.click();
	    
	}

	@Then("User click next button")
	public void user_click_next_button() {
		addEmployeePage.nextButton1.click();
		BrowserUtils.waitFor(3);
		addEmployeePage.eeoRaceAndEthnicityDropDown.click();
		addEmployeePage.white.click();
		
		BrowserUtils.waitForClickablility(addEmployeePage.nextButton2, 10);
		addEmployeePage.nextButton2.click();
	}

	@Then("User chooses region, fte and temporary_department")
	public void user_chooses_region_fte_and_temporary_department() {
		BrowserUtils.waitFor(5);
		addEmployeePage.regionDropDown.click();
		addEmployeePage.region_1.click();
		
		addEmployeePage.fteDropDown.click();
		addEmployeePage.fte0_5.click();
		
		addEmployeePage.temporaryDepartmentDropDown.click();
		addEmployeePage.subUnit_1.click();
	}

	@When("User click save button")
	public void user_click_save_button() {
		addEmployeePage.saveButton.click();
		
	}

	@Then("Employee's Personal Details page should be loaded")
	public void employee_s_Personal_Details_page_should_be_loaded() {
		BrowserUtils.waitForVisibility(addEmployeePage.personalDetailsTab, 5);
		assertEquals(addEmployeePage.expectedPersonalDetailsPageTitle, Driver.getDriver().getTitle());
		System.out.println("Actual page title is: "+Driver.getDriver().getTitle());
	}

	

}
