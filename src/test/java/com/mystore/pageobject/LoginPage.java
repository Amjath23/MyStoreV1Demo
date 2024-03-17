package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
WebDriver ldriver;

	

	//constructor
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(id = "login2") 
	WebElement login;
	
	@FindBy(id = "loginusername") 
	WebElement loginUsername;
	

	@FindBy(id = "loginpassword") 
	WebElement loginPassword;
	
	@FindBy(xpath = "//button[text()='Log in']") 
	WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Log out']") 
	WebElement logout;
	
	//a[text()='Log out']

	public void clickOnLogin() {
		login.click();
	}
	
	public void enterUsername(String uname) {
		loginUsername.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		loginPassword.sendKeys(pwd);
	}
	
	public void Clickonloginbutton() {
		loginButton.click();
	}
	
	
	public void Clickonlogoutbutton() {
		logout.click();
	}
}
