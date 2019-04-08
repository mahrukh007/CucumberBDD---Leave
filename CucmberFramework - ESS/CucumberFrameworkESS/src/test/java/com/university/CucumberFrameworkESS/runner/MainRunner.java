package com.university.CucumberFrameworkESS.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/java/com/university/CucumberFrameworkESS/FeatureFiles/Leave.Feature"},
		glue = {"com.university.CucumberFrameworkESS.Steps"},
		monochrome = true, 
		tags = {}, 
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", }

		) 
public class MainRunner extends AbstractTestNGCucumberTests{
	

}
