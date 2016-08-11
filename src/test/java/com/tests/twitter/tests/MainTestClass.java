package com.tests.twitter.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.twitter.pages.twitterInitialpage;
import com.test.twitter.pages.twitterLoginpage;

public class MainTestClass {
	
	@Test
	public void testpages() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver(); //Webdriver, enterprise level
		driver.get("http://www.twitter.com");
		driver.manage().window().maximize();
		
		// ***TWITTER HOME PAGE***
		
		twitterInitialpage ip = PageFactory.initElements(driver, twitterInitialpage.class); //new twitterInitialpage();
		//ip.ClickOnlogin(); //User clicking on login button which will open login page
		
		//***TWITTER LOGIN PAGE***
		
		//twitterLoginpage lp = PageFactory.initElements(driver, twitterLoginpage.class);
		twitterLoginpage lp = ip.ClickOnlogin();
		lp.Enteremailinfo("seleniumv1@gmail.com");
		lp.Enterpasswordinfo("Testing123!");
		lp.LoginButton.click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}
