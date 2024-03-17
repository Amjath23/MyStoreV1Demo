package com.mystore.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage {


	// TODO Auto-generated method stub

	WebDriver ldriver;



	//constructor
	public Homepage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(id = "nava") 
	WebElement productstore;

	@FindBy(xpath = "//a[@href='index.html' and @class='nav-link']") 
	WebElement home;


	@FindBy(xpath = "//a[text()='Contact']") 
	WebElement contact;

	@FindBy(xpath = "//a[text()='About us']") 
	WebElement AboutUs;

	//a[text()='Log out']
	@FindBy(xpath = "//a[text()='Log out']") 
	WebElement Logout;

	@FindBy(id = "cat") 
	WebElement Categories;

	@FindBy(xpath = "//a[text()='Phones']") 
	WebElement Phones;

	@FindBy(xpath = "//a[text()='Phones']") 
	WebElement samsunggalaxy;

	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a") 
	WebElement Addtocart;

	

	@FindBy(xpath = "//a[text()='Cart']") 
	WebElement cart;


	@FindBy(xpath = "//button[text()='Place Order']") 
	WebElement placeOrder;


	public void verifyproductstore() {
		productstore.isDisplayed();
	}

	public void verifyhome() {
		home.isDisplayed();
	}

	public void verifycontact() {
		contact.isDisplayed();
	}

	public void verifyAboutus() {
		AboutUs.isDisplayed();
	}

	public void verifyLogout() {
		Logout.isDisplayed();
	}

	public void verifyCategories() {
		Categories.isDisplayed();
	}

	public void clickonPhones() {
		Phones.click();
	}

	public void clickonsamsunggalaxy()  {
		samsunggalaxy.click();
		
	}

	public void clickonAddtocart() {
		Addtocart.click();
		ldriver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		Alert alert = ldriver.switchTo().alert();
		String msg  =  alert.getText();
		System.out.println(msg);
        alert.accept();
	}

	public void clickoncart() {
		cart.click();
	}

	public void clickonplaceorder() {
		placeOrder.click();
	}



	






}
