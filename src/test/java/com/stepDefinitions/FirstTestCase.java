package com.stepDefinitions;

import java.io.IOException;

import com.pages.AmazonExamples;
import com.webdriver.generics.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTestCase extends DriverFactory {
	
	AmazonExamples fst = new AmazonExamples();
	@Given("User is on specified url")
	public void user_is_on_specified_url() throws IOException {
		//fst.amazon();
		System.out.println("Test case: one");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() throws IOException {
		//fst.launch();
	}

	@Then("Login page displayed")
	public void login_page_displayed() {
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	}

}
