package com.ebanking.testCases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.Before;

//import com.qascript.AbstractTestNGCucumberTests;

//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.jupiter.api.Test;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features={"D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\src\\test\\java\\Features"},
		//glue= {"D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\src\\test\\java\\com\\ebanking\\testCases"},
		//plugin={"html:src\\test\\java\\Test\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\test\\java\\Test\\rep2.json"}
		/*plugin={"pretty",
                "json:BDD_YOUTUBE_ENGLISH/src/test/java/Test/result.json",
                "junit:BDD_YOUTUBE_ENGLISH/src/test/java/Test/cucumber.xml"},*/
		tags= "@Login"
		)

public class FirstRunner extends io.cucumber.testng.AbstractTestNGCucumberTests  {
public static WebDriver driver;
Logger logger;
TC_LoginPage_1 test;
//@Before("@Login")
@BeforeClass
	public  void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\Drivers\\chromedriver.exe");
		//System.getProperty("user.dir")+"//Drivers//chromedriver.exe"
		driver= new ChromeDriver();
		//return driver;
		//test=new TC_LoginPage_1(driver,logger);
		
	}
	//test=new TC_LoginPage_1(driver);
	
//	@AfterClass
//	public void TearDown() {
//		driver.quit();
//	}
}
