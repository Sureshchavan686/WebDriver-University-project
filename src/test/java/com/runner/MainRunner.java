package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
(stepNotifications = true,
features= "src/test/resources/webdriveruniversity_features/Login.feature",
glue= {"com.stepDefinitions"},
tags= {},
plugin= {"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/report.html"},
monochrome=true,
dryRun=false
)
public class MainRunner extends AbstractTestNGCucumberTests{

	
	
}
