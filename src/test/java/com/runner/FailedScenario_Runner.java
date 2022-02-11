package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions( 
monochrome = true, 
features = "@target/rerun.txt",
plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/report.html" }

)
public class FailedScenario_Runner {

}
