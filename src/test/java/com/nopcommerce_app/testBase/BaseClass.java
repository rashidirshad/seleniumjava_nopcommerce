package com.nopcommerce_app.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties configPropObj;
	//This will get the related class getClass of TC class and
	// generate logs.
	public Logger logger=LogManager.getLogger(this.getClass());
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) throws IOException
	{
		//use this hardcoded method
		//driver=System.setProperty("driver.chrome.webdriver","path");
	
		//or use this automatic method
		
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		configPropObj=new Properties();
		FileInputStream configfile=new FileInputStream(System.getProperty("user.dir")+"\\resources\\config.properties");
		configPropObj.load(configfile);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
