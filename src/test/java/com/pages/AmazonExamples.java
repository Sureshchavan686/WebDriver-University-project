package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.BaseLibrary;
import com.generics.DriverFactory;

public class AmazonExamples extends BaseLibrary{
	
	
	 
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")
	public static WebElement mnu_App;	

	
	
	public void amazon()
	{
		System.out.println("Inside amazon test case");
		click(mnu_App);
	}
	
}
