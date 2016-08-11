package com.test.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.twitter.config.Configuration;

public class twitterInitialpage {
	
	//Edited to container and constructor concepts
	WebDriver driver;
	public twitterInitialpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Section for element locators
	
	//@FindBy(xpath=".//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
	@FindBy(xpath=Configuration.Login)
	
	//Create object for element
	public WebElement Login;
	
	public twitterLoginpage ClickOnlogin()
	{
		Login.click();
		twitterLoginpage lp = PageFactory.initElements(driver, twitterLoginpage.class);
		return lp;
	}
}
