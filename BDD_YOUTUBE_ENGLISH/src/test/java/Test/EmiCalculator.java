package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmiCalculator {
	
	
	
	WebDriver driver;
	
	
	@Given("user is emi calculator page")
	public void user_is_emi_calculator_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="https://emicalculator.net/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    //throw new io.cucumber.java.PendingException();
	}
	@After("@Emi")
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
       // WebDriver driver = new ChromeDriver();;
        driver.close();
	}

	@Given("user clicks home loan tab")
	public void user_clicks_home_loan_tab() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("Home Loan")).click();
	    //throw new io.cucumber.java.PendingException();
	}


	@When("user makes")
	public void user_makes(io.cucumber.datatable.DataTable table) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		
		WebElement web=driver.findElement(By.xpath("//*[@id=\"loanamountslider\"]/span"));
		Actions a= new Actions(driver);
		a.dragAndDropBy(web, 10, 0).perform();
		
		String string1=driver.findElement(By.xpath("//*[@id=\"loanamount\"]")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Hi"+string1);
		List<List<String>> data=table.asLists(String.class);
		for(List<String> e:data) {
			System.out.println(e);
			for(String f:e) {
				System.out.println(f);
				//String c=String.format("#%02x%02x%02x",rvalue,gvalue,bvalue);
		Assert.assertEquals(string1,f.toString());}
		
			}
		
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user puts")
	public void user_puts(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	}
	@When("user made")
	public void user_made(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user can verify {string} ,{string} ,{string}")
	public void user_can_verify(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("bye"+string+string2+string3);
	}

}
