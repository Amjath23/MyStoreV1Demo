package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	WebDriver ldriver;



	//constructor
	public Addtocartpage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	@FindBy(id = "itemc") 
	WebElement monitors;

	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a") 
	WebElement Applemonitor;
	
	//*[@id="tbodyid"]/div[2]/div/div/h4/a
	
	@FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a") 
	WebElement Asusmonitor;
	
	public void clickonApplemonitor() {
		
		Applemonitor.click();
	}
	
    public void clickonAsusmonitor() {
		
	 Asusmonitor.click();
	}


}
