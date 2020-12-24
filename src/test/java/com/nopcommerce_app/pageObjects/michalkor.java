package com.nopcommerce_app.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class michalkor {
		WebDriver driver;
		
		public michalkor(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//set all elements on the form
		@FindBy(xpath="//span[@class='Select-value-label']")
		@CacheLookup
		WebElement dd;
		
		@FindBy(xpath="//span[@id='react-select-2--value-item']")
		@CacheLookup
		WebElement dd1;
		
		public void setdd(String qty) throws InterruptedException
		{
			//.clear();
			//driver.findElement(By.xpath("//label[normalize-space()='XS']")).click();			///////////////////////
			
			dd.click();
			Thread.sleep(3000);//);sleep(3000);
			new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
			new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
			new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
			new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();//();
			
			
			new Actions(driver).sendKeys(Keys.ENTER).perform();
		     
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[@aria-label='add to bag']")).click();
			
			//driver.findElement(By.xpath("//div[@id='checkout-sign-in-modal']//span[@aria-hidden='true'][normalize-space()='×']")).click();			///////////////////////
			
			//	if(driver.findElement(By.xpath("//span[@id='react-select-2--value-item']")).isDisplayed())
			/// {
			 //String getData = driver.findElement(By.xpath("//span[@aria-labelledby='select2-id_event_operator-container']")).getAttribute("aria-activedescendant");
			 //}
			//dd.sendKeys(qty);
		}
		
		
		
}
