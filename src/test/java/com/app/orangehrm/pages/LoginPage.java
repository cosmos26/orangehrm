package com.app.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement element = null;
	
	public static WebElement loginField (WebDriver driver) {
		element = driver.findElement(By.name("txtUsername"));
		return element;
	}
	
	public static void fillLoginField(WebDriver driver, String login) {
		element = loginField(driver);
		element.sendKeys(login);
	}
	
	public static WebElement passwordField (WebDriver driver) {
		element = driver.findElement(By.name("txtPassword"));
		return element;
	}
	
	public static void fillPasswordField(WebDriver driver, String password) {
		element = passwordField(driver);
		element.sendKeys(password);
	}
	
	public static WebElement loginButton (WebDriver driver) {
		element = driver.findElement(By.name("Submit"));
		return element;
	}
	
	public static void clickLogin(WebDriver driver) {
		element = loginButton(driver);
		element.click();
	}

}
