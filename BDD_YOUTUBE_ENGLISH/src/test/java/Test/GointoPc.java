package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GointoPc {
	WebDriver driver;
	@Before("@Test")
    public void beforeScenario(){
		
		 String url="https://getintopc.com/";
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
        System.out.println("This will run before the Scenario");
    }	
	
	@After("@Test")
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
       // WebDriver driver = new ChromeDriver();;
        driver.close();
    }
	@Given("user is on go into pc home page")
	public void user_is_on_go_into_pc_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("menu-item-35")).click();
		Thread.sleep(1000);
		System.out.println("This will run in Given");
	    //throw new io.cucumber.java.PendingException();
	   
	}

	@When("user enters the {string} in search field")
	public void user_enters_the_in_search_field(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		System.out.println("This will run in when");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/ul/li[1]/div/div/form/fieldset/input[1]")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/ul/li[1]/div/div/form/input")).click();

		Thread.sleep(1000);
		System.out.println("This will run in when");
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user can see search results matching with search text")
	public void user_can_see_search_results_matching_with_search_text() throws Exception {
		System.out.println("This will run in Then");
		Thread.sleep(1000);
		driver.findElement(By.id("menu-item-35")).click();
		Thread.sleep(1000);
		System.out.println("This will run in Then");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks software categories")
	public void user_clicks_software_categories() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This will run in 2nd when");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see search results with categories")
	public void user_can_see_search_results_with_categories() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Home page")
	public void user_clicks_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on pagination")
	public void user_clicks_on_pagination() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see search results will be changed with pagination")
	public void user_can_see_search_results_will_be_changed_with_pagination() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
