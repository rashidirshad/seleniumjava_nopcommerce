package com.nopcommerce_app.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nopcommerce_app.pageObjects.LoginPage;
import com.nopcommerce_app.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 extends BaseClass{
	//public WebDriver driver;
	
	/////////////////////////////////////
	@Test
	public void loginTest() throws InterruptedException
	{
		
		//driver.get("admin-demo.nopcommerce.com");
		//WebDriverWait some_element = new WebDriverWait(driver,100); 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.location='"+configPropObj.getProperty("baseURL")+"';");
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Setting login details");
		lp.setUserName(configPropObj.getProperty("useremail"));
		//Thread.sleep(2000);
		lp.setPassword(configPropObj.getProperty("password"));
		
		lp.clickLogin();
		
		//compare title to test the testcase
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Setting Failed");//error
			Assert.assertTrue(false);
		}
		logger.info("Finished Test");
	}
	
}
