package com.app.orangehrm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = { "pretty:target/cucumber-pretty.txt", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "rerun:target/rerun.txt" }, 
		tags = "",
		features = { "src/test/resources/com/orangehrm/features" }, 
		glue = "com/app/orangehrm/stepdefinitions",
		dryRun = false
		
)

public class CukesRunner extends AbstractTestNGCucumberTests  {
	

}
