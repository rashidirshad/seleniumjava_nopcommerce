package com.nopcommerce_app.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//set all elements on the form
		@FindBy(id="Email")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(xpath="//input[@id='Password']")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@value='Log in']")
		@CacheLookup
		WebElement btnLogin;
		
		public void setUserName(String email)
		{
			txtEmail.clear();
			txtEmail.sendKeys(email);
		}

		public void setPassword(String password)
		{
			txtPassword.clear();
			txtPassword.sendKeys(password);
		}

		public void clickLogin()
		{
			btnLogin.click();
		}
		
		
		
}
