package com.webuniversity.CucumberFrameworkESS.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/java/com/webuniversity/CucumberFrameworkESS/FeatureFiles/Leave.Feature"},
		glue = {"com.webuniversity.CucumberFrameworkESS.Steps"},
		monochrome = true, 
		tags = {}, 
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", }

		) 
public class MainRunner {
	

}
