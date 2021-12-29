package com.excel.lib.util;
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
		features={"src/test/java/Features"},
		//glue= {"/BDD_YOUTUBE_ENGLISH/src/test/java/Test"},
		//plugin={"html:src\\test\\java\\Test\\rep.html","junit:src\\reports\\rep1.xml","json:\\src\\test\\java\\Test\\rep2.json"}
		plugin={"pretty",
                "json:BDD_YOUTUBE_ENGLISH/src/test/java/Test/result.json",
                "junit:BDD_YOUTUBE_ENGLISH/src/test/java/Test/cucumber.xml"},
		tags= "@Flipcart"
		)

public class FirstRunner {}
