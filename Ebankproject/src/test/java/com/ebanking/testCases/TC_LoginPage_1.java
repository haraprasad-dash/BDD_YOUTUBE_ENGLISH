package com.ebanking.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.Webbase.driver;
//import org.openqa.selenium.chrome.Chromebase.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ebanking.utilities.ReadConfig;
import com.ebanking.pageObjets.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_LoginPage_1  {
	
//public static Webbase.driver base.driver;
public static LoginPage lp;
public static Logger logger;
public static Actions action;
public static Alert alert;
BaseClass base;
public static ReadConfig read;

//@Before("@Login")
//public void setup() throws Exception {
//	System.setProperty("webbase.driver.chrome.base.driver","D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\base.drivers\\chromebase.driver.exe");
//	//System.getProperty("user.dir")+"//base.drivers//chromebase.driver.exe"
//	System.out.println("HI Before Class-------------------------");
//	base.driver= new Chromebase.driver();
//	logger=LogManager.getLogger(TC_LoginPage_1.class);
//	logger.info("Setup");
//}
//
//@After("@Login")
//public void teardown() throws Exception {
//	base.driver.quit();
//	logger.info("browser closed of all instances");
//}
public TC_LoginPage_1(BaseClass base) {
	this.base=base;
	
}

@Test
@Given("user is banking sign in page using {string}")
public void user_is_banking_sign_in_page_using(String string) {
    // Write code here that turns the phrase above into concrete actions
	//System.setProperty("webbase.driver.chrome.base.driver","D:\\git\\BDD_YOUTUBE_ENGLISH\\Ebankproject\\base.drivers\\chromebase.driver.exe");
	
	//base.driver=new Chromebase.driver();
	System.out.println("HI-------------------------");
    base.driver.get(string);
    base.driver.manage().window().maximize();
    lp=new LoginPage(base.driver);
    logger=LogManager.getLogger(TC_LoginPage_1.class);
   logger.info("login page");
	//throw new io.cucumber.java.PendingException();
}

@Test
@When("user gives username {string}")
public void user_gives_username(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);

    lp.userid.sendKeys(string);
    logger.info("username");
	//throw new io.cucumber.java.PendingException();
}

@Test
@When("user gives password {string}")
public void user_gives_password(String string) {
    // Write code here that turns the phrase above into concrete actions

    lp.password.sendKeys(string);
	//throw new io.cucumber.java.PendingException();
    logger.info("password");
}

@Test
@When("user clicks login button")
public void user_clicks_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
lp.login.click();

if(base.isAlertPresent(base.driver))
{
	alert=base.driver.switchTo().alert();
	System.out.println(alert.getText());
	logger.info(alert.getText());
	alert.accept();
	Thread.sleep(2000);
	lp=new LoginPage(base.driver);
	//lp.userid.clear();
	//lp.password.clear();
	read=new ReadConfig();
	user_gives_username(read.getusername());
	user_gives_password(read.getpassword());
	lp.login.click();
	
}


//throw new io.cucumber.java.PendingException();
logger.info("login button");
}

@Test
@Then("user can verify the title")
public void user_can_verify_the_title() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println(base.driver.getTitle());
	//throw new io.cucumber.java.PendingException();
    logger.info("title verification");
}
}
