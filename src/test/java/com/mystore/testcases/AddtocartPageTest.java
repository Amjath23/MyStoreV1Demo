package com.mystore.testcases;

import com.mystore.pageobject.Addtocartpage;

public class AddtocartPageTest extends Baseclass {

	
	public void verifycartitems() {
		
		Addtocartpage ad =new Addtocartpage(driver);
		
		ad.clickonApplemonitor();
		logger.info("apple monitor added to cart");
		  
	//	ad.clickonAsusmonitor();
		logger.info("asus monitor added to cart");
		
	}
}
