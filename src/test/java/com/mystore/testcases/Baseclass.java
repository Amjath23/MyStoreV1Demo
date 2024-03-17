package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.commons.io.FileUtils;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	//public String emailAddress = readConfig.getEmail() ;
	//String password = readConfig.getPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup()
	{

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

		//implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//for logging
		logger = LogManager.getLogger("MyStoreV1");
		
		//open url
		driver.get(url);
		logger.info("url opened");
		driver.manage().window().maximize();
	}

	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	



	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	

}