package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/webdriveruniversity_features/Login.feature"},
		glue= {"com.stepDefinitions"},
		monochrome =true,
		dryRun=false,
		tags= {"@Smoke"},
		plugin= {"pretty",
				"html:target/cucumber","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/report.html",
		"rerun:target/rerun.txt"}
		)
public class WebDriverUniversityRunner extends AbstractTestNGCucumberTests{

}
