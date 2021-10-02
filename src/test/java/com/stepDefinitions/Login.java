package com.stepDefinitions;

import com.pages.LoginPage;
import com.webdriver.generics.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends DriverFactory {

	LoginPage lg = new LoginPage();
	
	@Given("user is on webdriveruniversity.com page")
	public void user_is_on_webdriveruniversity_com_page() {
	
		lg.clickOnLogin();
	}

	@When("user click on login portal to sign in")
	public void user_click_on_login_portal_to_sign_in() {
		lg.swithcToChildTab();
	}

	@Then("user enters Username {string}")
	public void user_enters_Username(String username) {
		lg.enterUserName(username);
	}

	@Then("user enters Password {string}")
	public void user_enters_Password(String password) {
		lg.enterPassword(password);
	}

	@Then("user submits the details")
	public void user_submits_the_details() {
		lg.clickOnSubmit();
	}
}
