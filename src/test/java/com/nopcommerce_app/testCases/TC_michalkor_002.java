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
import com.nopcommerce_app.pageObjects.michalkor;
import com.nopcommerce_app.testBase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_michalkor_002 extends BaseClass{
	//public WebDriver driver;
	
	/////////////////////////////////////
	@Test
	public void loginTest() throws InterruptedException
	{
		
		//driver.get("admin-demo.nopcommerce.com");
		//WebDriverWait some_element = new WebDriverWait(driver,100); 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.location='"+configPropObj.getProperty("mc")+"';");
		michalkor lp=new michalkor(driver);
		lp.setdd("3");
	}	
}
