package com.ebanking.testCases;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass {
	
	public static WebDriver driver;
	String Username;
	String Password;
	String Url;
	
	@Before("@Login")
		public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\Drivers\\chromedriver.exe");
//		//System.getProperty("user.dir")+"//Drivers//chromedriver.exe"
		driver= new ChromeDriver();
	}
	@After("@Login")
	public void TearDown() {
		driver.quit();
	}
	public boolean isAlertPresent(WebDriver driver){
		//this.driver=driver;
	    boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(driver, 5 /*timeout in seconds*/);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	    } catch (TimeoutException eTO) {
	        foundAlert = false;
	    }
	    return foundAlert;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver1) {
		driver = driver1;
	}
//	public static byte[] takeScreenShot() {
//		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	}
	@AfterStep
	public void afterScenario(Scenario scenario) {
		//scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
		if (scenario.isFailed())
		{
			scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
		}
	}
	
	

}
