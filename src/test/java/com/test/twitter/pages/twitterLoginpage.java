package com.test.twitter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class twitterLoginpage {
	
	//Information about elements, locators
	
	@FindBy(xpath=".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")
	public WebElement Email;
	
	@FindBy(xpath=".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")
	public WebElement Password;
	
	@FindBy(xpath=".//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
	public WebElement LoginButton;
	
	// Methods
	
	public void Enteremailinfo(String myemail) //parameter to capture value
	{
		Email.sendKeys(myemail);
	}
	
	public void Enterpasswordinfo(String mypassword)
	{
		Password.sendKeys(mypassword);
	}
	
	public void ClickLoginButton(String loginbutton) //parameter to capture value
	{
		LoginButton.sendKeys(loginbutton);
	}

}
