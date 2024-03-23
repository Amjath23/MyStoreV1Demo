package com.mystore.testcases;


import org.testng.annotations.Test;

import com.mystore.pageobject.Homepage;
import com.mystore.pageobject.Indexpage;

public class TC_HomePageTest extends Baseclass {
  @Test
	public void verifyHomepagelabels() 
	{

		logger.info("***************TestCase Verify Home page tabs*****************"); 


		Homepage hp =new Homepage(driver);
		

		hp.verifyproductstore();
		logger.info("verified productstore label");
		
		hp.verifyhome();
		logger.info("verified home label");
		
		hp.verifycontact();
		logger.info("verified contact label");
		
		hp.verifyAboutus();;
		logger.info("verified Aboutus label");
		
		hp.verifyLogout();
		logger.info("verified Logout label");
		
		hp.verifyCategories();
		logger.info("verified Cathegories Logout label");
		
		hp.clickonPhones();
		logger.info("selected on phones tab");
		
		hp.clickonsamsunggalaxy();
		logger.info("selected galaxy tab");
		
		hp.clickonAddtocart();
		logger.info("clicked on Add to cart");
		
		hp.clickoncart();
		logger.info("selected cart page");
		
		hp.clickonplaceorder();
		logger.info("placed order");
		
		hp.enterName();
		logger.info("enter username");
		
		hp.enterCountry();
		
		hp.enterCity();
		hp.enterCard();
		
		hp.enterMonth();
		
		hp.enterYear();
		
		logger.info("entered Year");
		
		hp.clickonpurchase();
		logger.info("purchase the product");
		
		
	}
}
