package com.mystore.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.LoginPage;
import com.mystore.utilities.ReadExcelFile;

public class TC_Loginpagetest2 extends Baseclass {
	@Test(dataProvider = "LoginDataProvider")
	public void VerifyLogin(String username, String password)
	{

		logger.info("***************TestCase Verify Login starts*****************"); 


		LoginPage lp = new LoginPage(driver);
         lp.clickOnLogin();
		
		logger.info("Clicked on Login link");
		
		lp.enterUsername(username);
		logger.info("entered the username");
		
		lp.enterPassword(password);
		logger.info("entered the password");
		
		lp.Clickonloginbutton();
		logger.info("user successfully logged");
		
		lp.Clickonlogoutbutton();
		logger.info("user successfully logged out");
	}	
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	}
}
