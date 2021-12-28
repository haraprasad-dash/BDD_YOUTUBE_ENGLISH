package Test;

import static org.junit.Assert.assertEquals;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


//import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {
	WebDriver driver; 
	Logger logger=LogManager.getLogger(Flipkart.class);
    
	
	@Given("user is flipkart home sign on page")
	public void user_is_flipkart_home_sign_on_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		String url="https://flipkart.com/";
		//driver.navigate().to(url);
		driver.get(url);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_2doB4z")));
	    //throw new io.cucumber.java.PendingException();
	}
	@After("@Flipkart")
	public void driver_close() {
		driver.quit();
	}
	@After("@Goibibo")
	public void driver_close1() {
		driver.quit();
	}
	@After("@alert")
	public void driver_close2() {
		driver.quit();
	}

	@Given("user clicks close button in sign up page")
	public void user_clicks_close_button_in_sign_up_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user searches for {string}")
	public void user_searches_for(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("_3704LK")).sendKeys(string+Keys.ENTER);
		Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user can verify no of results coming")
	public void user_can_verify_no_of_results_coming() {
	    // Write code here that turns the phrase above into concrete actions
		try {
		System.out.println(driver.findElement(By.className("_10Ermr")).getText());
	}
	catch(Exception e)
	{e.printStackTrace();}
}

	    //throw new io.cucumber.java.PendingException();
	
	@Then("verify the alternate text at iphone13")
	public void verify_the_alternate_text_at_iphone13() {
		try {
		String string1=driver.findElement(By.className("_2LR_KO")).getText();
		String string2= driver.findElement(By.className("tMzY0d")).getText();
	    System.out.println(string1 +string2);
		}
		catch(Exception e)
		{e.printStackTrace();}
	}

	@Then("system should take the snapshot of that page")
	public void system_should_take_the_snapshot_of_that_page() {
	    // Write code here that turns the phrase above into concrete actions
		File snap= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(snap, new File("D:\\Java snapshot\\Snapshot.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	    //throw new io.cucumber.java.PendingException();//*[@id="container"]/div/div[2]/div/div/span[3] //*[@id="container"]/div/div[2]/div/div/div/div[1]/a[7]
	}
	@Then("user clicks on mens dropdown then user selects jeans option")
	public void user_clicks_on_mens_dropdown_then_user_selects_jeans_option() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]")).click();
	    //WebElement ele = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]"));
	    Thread.sleep(2000);
	   // Select form = new Select(ele);
	    //form.selectByVisibleText("Jeggings & Tights");
	    Actions act=new Actions(driver);
	    try {
		WebElement hover=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[4]"));
	    act.moveToElement(hover).perform();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();

		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	    Thread.sleep(2000);
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("user navigates to parent page to search")
	public void user_navigates_to_parent_page_to_search() {
	    // Write code here that turns the phrase above into concrete actions
		Set<String> string=driver.getWindowHandles();
		System.out.println(string);
		for (String st:string) {
			System.out.println(st);
			driver.switchTo().window(st);
			String st1=driver.getTitle();
			System.out.println(st1);
		}
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user navigates to child webpage to search")
	public void user_navigates_to_child_webpage_to_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user is doing pagination in child page")
	public void user_is_doing_pagination_in_child_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Test
	@Given("user is datatable  page using the {string}")
	public void user_is_datatable_page_using_the(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//List<WebElement> iterate=driver.findElements(By.cssSelector("#example_paginate>span>a"));
		//System.out.println(iterate);
		Integer iterator=driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
		System.out.println(iterator);
		List<String> names= new ArrayList<String>();
		for(Integer i = 1;i<=iterator;i++) {
			driver.findElement(By.cssSelector("#example_paginate>span>a:nth-child("+i+")")).click();
			List<WebElement> name = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
			//names.add(iterator);
			for(WebElement j:name) {
				names.add(j.getText());
			}
		}
		System.out.println(names);
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("user selects dropdown and set to {string}")
	public void user_selects_dropdown_and_set_to(String int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement entity=driver.findElement(By.xpath("//select[@name='example_length']"));
		Select selectto=new Select(entity);
		System.out.println(int1);
		
		selectto.selectByValue("25");
		Thread.sleep(2888);
		
	    //throw new io.cucumber.java.PendingException();
	}

	
	@Then("user can verify names present in table")
	public void user_can_verify_names_present_in_table() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Test
	@Then("user can verify total no of {string}")
	public void user_can_verify_total_no_of(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String a=driver.findElement(By.id("example_info")).getText().split(" ")[5];
		System.out.println("Hi"+a);
		SoftAssert assert1= new SoftAssert();
		assert1.assertEquals(a,String.valueOf(string));
		System.out.println("Bye Bye");
		assert1.assertAll();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,5000)");//0 mean horizontal position,5000 mean vertical position
		//WebElement element=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/p[3]/a[1]"));
		//js.executeScript("arguments[0].scrollIntoView();",element);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		System.out.println("Scrolling action");
	    //throw new io.cucumber.java.PendingException();
	}

@Given("user is goibibo  page using the {string}")
public void user_is_goibibo_page_using_the(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(string);
	
    //throw new io.cucumber.java.PendingException();
}

@When("user navigates to {string}")
public void user_navigates_to(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[id='departureCalendar']")).click();//div[class='DayPicker-Caption']>div
	String date=driver.findElement(By.cssSelector("div[class='DayPicker-Caption']>div")).getText();
	String[] Expected=string.split(" ");
	String Month=date.split(" ")[0].trim();
	String Year=date.split(" ")[1].trim();
	
	while(!(Month.equals(Expected[1].trim()) && Year.equals(Expected[2].trim())))
	{
		
		driver.findElement(By.cssSelector("span[class=\"DayPicker-NavButton DayPicker-NavButton--next\"]")).click();//
		date=driver.findElement(By.cssSelector("div[class='DayPicker-Caption']>div")).getText();
		Month=date.split(" ")[0].trim();
		Year=date.split(" ")[1].trim();
	System.out.println(Month+Year);	
	System.out.println(Expected[0]+Expected[1]);
	Thread.sleep(2000);
	}
	driver.findElement(By.xpath("//div[text()='15']")).click();
    //throw new io.cucumber.java.PendingException();
}


@Then("user can verify the date")
public void user_can_verify_the_date() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println(driver.findElement(By.cssSelector("#departureCalendar")).getAttribute("value"));
    //throw new io.cucumber.java.PendingException();
}

@Given("user is in alert  page using the {string}")
public void user_is_in_alert_page_using_the(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(string);
	driver.manage().window().maximize();
    //throw new io.cucumber.java.PendingException();
}
@When("user clicks click for js alert")
public void user_clicks_click_for_js_alert() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	HighlightElement(driver, driver.findElement(By.xpath("//button[contains(text(),'Click for JS ')]")));
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS ')]")).click();
	Thread.sleep(3000);
    //throw new io.cucumber.java.PendingException();
}
@Then("user can verify the alert with ok option")
public void user_can_verify_the_alert_with_ok_option() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
    //throw new io.cucumber.java.PendingException();
}
@When("user clicks on click for js confirm")
public void user_clicks_on_click_for_js_confirm() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	//System.out.println(driver.findElement(By.xpath("/button[contains(text(),'Click for JS Confirm')]")).getText());
	Thread.sleep(3000);
	HighlightElement(driver, driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")));
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
    //throw new io.cucumber.java.PendingException();
}
@Then("user can verify the alert with ok and cancel option")
public void user_can_verify_the_alert_with_ok_and_cancel_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.out.println( "Hello, user!" );
    logger.trace("We've just greeted the user!");
    logger.debug("We've just greeted the user!");
    logger.info("We've just greeted the user!");
    logger.warn("We've just greeted the user!");
    logger.error("We've just greeted the user!");
    logger.fatal("We've just greeted the user!");
    //throw new io.cucumber.java.PendingException();
}
@When("user clicks on click for js prompt")
public void user_clicks_on_click_for_js_prompt() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	//
    //throw new io.cucumber.java.PendingException();
}
@When("user send the text {string}")
public void user_send_the_text(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().alert().sendKeys(string);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	Thread.sleep(2666);

    //throw new io.cucumber.java.PendingException();
}
public void HighlightElement(WebDriver driver,WebElement element) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",element);
	Thread.sleep(2666);
	js.executeScript("arguments[0].setAttribute('style','border:solid 2px white;')",element);
}






}
