package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class Third {
	
		 WebDriver driver;
		 String url="https://www.netflix.com/in/";
		 @Given("user is on PackAndGo login page")
		 public void user_is_on_pack_and_go_login_page() {
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
							    throw new io.cucumber.java.PendingException();
			}
		
		@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\" credentials$")
		public void user_enters_the_and_credentials(String username, String password) throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			//id="id_email_hero_fuji"
			//driver.findElement(By.xpath("//*[@id=\"id_email_hero_fuji\"]/ul/li[4]/a")).click();
			//WebElement form=driver.findElement(By.xpath("//*[@id=\"loginForm\"]"));
			driver.findElement(By.id("id_email_hero_fuji")).sendKeys(username);
			Thread.sleep(5000);
			driver.findElement(By.id("id_email_hero_fuji")).sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.id("lang-switcher-select")).click();
			Thread.sleep(5000);
			//driver.quit();
		}
		@Then("^user logged in and checks for Edit Profile$")
		public void user_logged_in_and_checks_for_Edit_Profile() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			driver.findElement(By.xpath("//*[@id=\"sideMenu3\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"editAccount\"]")).click();
			
		}
		@Then("^user logout from application$")
		public void user_logout_from_application() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new PendingException();
			driver.findElement(By.xpath("//*[@id=\"topMenu2\"]/a")).click();
			driver.quit();
		}
	}



