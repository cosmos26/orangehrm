package com.app.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowAddEmp {
	public static WebElement element = null;
	
	public static WebElement firstName (WebDriver driver) {
		element = driver.findElement(By.id("firstName"));
		return element;
	}
	
	public static void fillFirstName(WebDriver driver, String fName) {
		element = firstName(driver);
		element.sendKeys(fName);
	}
	
	public static WebElement lastName (WebDriver driver) {
		element = driver.findElement(By.id("lastName"));
		return element;
	}
	
	public static void fillLastName(WebDriver driver, String lName) {
		element = lastName(driver);
		element.sendKeys(lName);
	}
	
	//Drop-down
	public static WebElement dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='select-wrapper initialized']//input[@class='select-dropdown']"));
		return element;
	}
	
	public static void clickDropdown(WebDriver driver) {
		element = dropdown(driver);
		element.click();
	}
	
	//Drop-down Location AU
	public static WebElement location (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Australian Regional HQ')]"));
		return element;
	}
	
	public static void clickAU(WebDriver driver) {
		element = location(driver);
		element.click();
	}
	
	//Next button 1
	public static WebElement nextButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='systemUserSaveBtn']"));
		return element;
	}
	
	public static void clickNextButton(WebDriver driver) {
		element = nextButton(driver);
		element.click();
	}
//Next button 2
	public static WebElement nextButton2 (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn waves-effect waves-light right']"));
		return element; 
	}
	
	public static void clickNextButton2(WebDriver driver) {
		element = nextButton2(driver);
		element.click();
	}
	
//Drop-down Region
	public static WebElement dropdownRegion(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='9_inputfileddiv']//input[@class='select-dropdown']"));
		return element;
	}
	
	public static void clickDropdownRegion(WebDriver driver) {
		element = dropdownRegion(driver);
		element.click();
	}
	
	//Choose Region-1 Region
	public static WebElement regionOne (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Region-1')]"));
		return element;
	}
	
	public static void chooseRegionOne(WebDriver driver) {
		element = regionOne(driver);
		element.click();
	}
	
//Drop-down FTE
	public static WebElement dropdownFTE(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='10_inputfileddiv']//input[@class='select-dropdown']"));
		return element;
	}
	
	public static void clickDropdownFTE(WebDriver driver) {
		element = dropdownFTE(driver);
		element.click();
	}
	
	//Choose 0.5 FTE	
	public static WebElement zeroPointFive (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'0.5')]"));
		return element;
	}
	
	public static void chooseZeroPointFive(WebDriver driver) {
		element = zeroPointFive(driver);
		element.click();
	}
	
//Drop-down Temp
	public static WebElement dropdownTemp(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='11_inputfileddiv']//input[@class='select-dropdown']"));
		return element;
	}
	
	public static void clickDropdownTemp(WebDriver driver) {
		element = dropdownTemp(driver);
		element.click();
	}
	
	//Choose Sub unit-1 in Temp	
	public static WebElement unitOne (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Sub unit-1')]"));
		return element;
	}
	
	public static void chooseUnitOne(WebDriver driver) {
		element = unitOne(driver);
		element.click();
	}
	
//Save button 
	public static WebElement saveButton (WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn waves-effect waves-light right']"));
		return element;
	}
	
	public static void clickSaveButton(WebDriver driver) {
		element = saveButton(driver);
		element.click();
	}
}
