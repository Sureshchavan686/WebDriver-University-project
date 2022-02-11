package com.stepDefinitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.webdriver.generics.BaseLibrary;
import com.webdriver.generics.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory{
	
	public static WebDriver driver;
	
	BaseLibrary bl = new BaseLibrary();
	 
	@Before() 
	public void setup() throws IOException 
	{
		driver = getDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.manage().deleteAllCookies();
		
	}
	
	/*
	 * @Before("@Smoke") public void setupSmoke() throws IOException { driver =
	 * getDriver(); driver.get("http://www.webdriveruniversity.com/");
	 * driver.manage().deleteAllCookies();
	 * System.out.println("Inside Before hook of Smoke tag");
	 * 
	 * }
	 */
	
	@After()
	public void closeUp()
	{
		System.out.println("Inside after loop"); 
		driver.quit();
	}
	
	/*
	 * @After("@Smoke") public void closeUpSmoke() {
	 * System.out.println("Inside after loop of tagged hook"); driver.quit(); }
	 */

}
