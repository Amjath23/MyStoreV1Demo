package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Indexpage;

public class TC_IndexPageTest  extends Baseclass{
     @Test
	public void verifyRegistrationAndLogin()
	{

		logger.info("***************TestCase Verify Registration and Login starts*****************"); 


		Indexpage pg = new Indexpage(driver);

		pg.clickOnSignIn();
		logger.info("Clicked on sign in link");
		
		pg.enterUsername("amjathkhan");
		logger.info("entered the username");
		
		pg.enterPassword("suresh@55");
		logger.info("entered the password");
		
		pg.ClickonSignbutton();
		logger.info("user is registered");
	}	
	
}
