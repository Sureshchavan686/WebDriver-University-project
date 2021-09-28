package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.BaseLibrary;
import com.generics.DriverFactory;

public class First extends BaseLibrary {
	
	@FindBy(xpath="")
	private WebElement btn_ok;
	
	
	
	public void launch() throws IOException
	{
		getURL();
		//driver.manage().window().maximize();
	}
	

}
