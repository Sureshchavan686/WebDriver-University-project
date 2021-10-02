package com.stepDefinitions;


import java.util.List;

import org.openqa.selenium.By;

import com.pages.WebUniversityPages;
import com.webdriver.generics.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebUniversity extends DriverFactory{
	
	WebUniversityPages pgs = new WebUniversityPages();
	
	@Given("User access webdriveruniversity.com")
	public void user_access_webdriveruniversity_com() {
		pgs.fillContatctUsForm();
		System.out.println("In the common given block");
	}

	@When("User click on Contact us button")
	public void user_click_on_Contact_us_button() {
		System.out.println("In the common when block");
	}

	@Then("User enteres FirstName")
	public void user_enteres_FirstName() {
		System.out.println("In the first scenario then block");
	}

	@Then("User Enters Lastname")
	public void user_Enters_Lastname() {
		System.out.println("In the first scenario then block");
	}

	@Then("User enters valid email")
	public void user_enters_valid_email() {
		System.out.println("In the first scenario then block");
	}

	@Then("User enters comments")
	public void user_enters_comments() {
		System.out.println("In the first scenario then block");
	}

	@Then("Clicks on Submit button")
	public void clicks_on_Submit_button() {
		System.out.println("In the first scenario then block");
	}

	@Then("User clicks on Reset button")
	public void user_clicks_on_Reset_button() {
		System.out.println("In the second scenario then block");
	}

	@Then("Details entered are cleared")
	public void details_entered_are_cleared() {
		System.out.println("In the second scenario then block");
	}
	
	@Then("User enteres invalid FirstName")
	public void user_enteres_invalid_FirstName(DataTable arg) throws Throwable {
	List<List<String>> data = arg.asList(String.class);
	String fname =data.get(1).get(0);
		driver.findElement(By.xpath("//input[@name='first_name' and @placeholder='First Name']")).sendKeys(fname);
	}
	
	@Then("User Enters invalid Lastname")
	public void user_Enters_invalid_Lastname(DataTable arg) {
	
	}
	@Then("User enters invalid valid email")
	public void user_enters_invalid_valid_email(DataTable arg) {
		
	}
	
	@Then("User enters invalid comments")
	public void user_enters_invalid_comments() {
		
	}
}
