package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.LoginPage;

public class TC_Loginpagetest extends Baseclass {
	@Test
	public void VerifyLogin()
	{

		logger.info("***************TestCase Verify Login starts*****************"); 


		LoginPage lp = new LoginPage(driver);
         lp.clickOnLogin();
		
		logger.info("Clicked on Login link");
		
		lp.enterUsername("amjathkhan");
		logger.info("entered the username");
		
		lp.enterPassword("suresh@55");
		logger.info("entered the password");
		
		lp.Clickonloginbutton();
		logger.info("user successfully logged");
	}	
}
