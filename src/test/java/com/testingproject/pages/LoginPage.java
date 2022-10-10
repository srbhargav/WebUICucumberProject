package com.testingproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
Initialization: Page factory will initialize every web element with reference
 to corresponding element on the actual web page based on locators
 */
public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Declare elements on Branch page by @findBy annotation
	@FindBy(xpath = "//a[normalize-space()='Form Authentication']")
	public WebElement authenticationLink;

	@FindBy(xpath = "//input[@id='username']")
	public WebElement usernameTxt;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordTxt;

	@FindBy(xpath = "//i[normalize-space()='Login']")
	public WebElement loginBtn;

	@FindBy(xpath = "//h2[normalize-space()='Secure Area']")
	public WebElement secureText;

	@FindBy(xpath = "//i[normalize-space()='Logout']")
	public WebElement logoutBtn;

	// Utilization: Methods to perform action on the web page
	public void enter_username(String username) {
		usernameTxt.sendKeys(username);
	}

	public void enter_password(String password) {
		passwordTxt.sendKeys(password);
	}

	public void ClickLogin() {
		loginBtn.submit();
	}

	public void ClickLink() {
		authenticationLink.click();

	}

	public void ClickLogOut() {
		logoutBtn.click();
	}

	public void secureText() {
		secureText.isDisplayed();
	}

}
