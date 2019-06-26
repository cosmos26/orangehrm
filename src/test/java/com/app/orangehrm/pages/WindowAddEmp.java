package com.app.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowAddEmp {
	public static WebElement element = null;
	
	public static WebElement firstName (WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='firstName']"));
		return element;
	}
	
	public static void fillFirstName(WebDriver driver, String fName) {
		element = firstName(driver);
		element.sendKeys(fName);
	}
	
	public static WebElement lastName (WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]"));
		return element;
	}
	
	public static void fillLastName(WebDriver driver, String lName) {
		element = lastName(driver);
		element.sendKeys(lName);
	}
	
	public static WebElement locationNY (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'New York Sales Office')]"));
		return element;
	}
	
	public static void clickLocationNY(WebDriver driver) {
		element = locationNY(driver);
		element.click();
	}
	
	public static WebElement nextButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='systemUserSaveBtn']"));
		return element;
	}
	
	public static void clickNextButton(WebDriver driver) {
		element = nextButton(driver);
		element.click();
	}

}
