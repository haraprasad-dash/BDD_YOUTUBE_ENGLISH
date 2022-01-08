package com.ebanking.pageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//input[@name='uid']")
	@CacheLookup
	public
	WebElement userid;
	
	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	public
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	@CacheLookup
	public
	WebElement login;

}
