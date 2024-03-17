package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {

	WebDriver ldriver;

	

	//constructor
	public Indexpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		

		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(id = "signin2") 
	WebElement signUp;
	
	@FindBy(id = "sign-username") 
	WebElement Username;
	

	@FindBy(id = "sign-password") 
	WebElement Password;
	
	@FindBy(xpath = "//button[text()='Sign up']") 
	WebElement SignupButton;
	

	public void clickOnSignIn() {
		signUp.click();
	}
	
	public void enterUsername(String uname) {
		Username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		Password.sendKeys(pwd);
	}
	
	public void ClickonSignbutton() {
		SignupButton.click();
	}
	
	
	
	
}
