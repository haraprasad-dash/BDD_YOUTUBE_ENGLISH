package Test;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.jupiter.api.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src\\test\\java\\Test"},
		//,
		//plugin={"html:src\\test\\java\\Test\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\test\\java\\Test\\rep2.json"}
		//tags= {"@EDUBankTeller"}
		tags="@alert"
		)

public class Runner {}
