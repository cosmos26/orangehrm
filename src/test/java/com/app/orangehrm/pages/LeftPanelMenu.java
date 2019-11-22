package com.app.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftPanelMenu {
	
	public static WebElement element = null;
	
	public static WebElement itemPIM (WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'PIM')]"));
		return element;
	}
	public static void clickPIM(WebDriver driver) {
		element = itemPIM(driver);
		element.click();
	}
	
	public static WebElement itemAddEmployee (WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']//span[@class='left-menu-title'][contains(text(),'Add Employee')]"));
		return element;
	}
	
	public static void clickaddEmployee(WebDriver driver) {
		element = itemAddEmployee(driver);
		element.click();
	}

}
