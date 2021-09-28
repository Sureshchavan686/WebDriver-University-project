package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.generics.BaseLibrary;

public class WebUniversityPages extends BaseLibrary{

	
	@FindBy(xpath="//a[@id='contact-us']")
	public static WebElement btn_ContactUs;
	
	@FindBy(xpath="//input[@name='first_name' and @placeholder='First Name']")
	public static WebElement fld_fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	public static WebElement fld_lname;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement fld_email;
	
	@FindBy(xpath="//textarea[@name='message']")
	public static WebElement fld_comments;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement btn_submit;
	
	@FindBy(xpath="//input[@type='reset']")
	public static WebElement btn_reset;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public static WebElement btn_Ok;
	
	public void fillContatctUsForm()
	{
		System.out.println("Inside page object class");
		click(btn_ContactUs);
		waitTill("2");
		String parwin = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		while(itr.hasNext())
		{
			String child = itr.next();
			if(!(parwin.equals(child)))
			{
				driver.switchTo().window(child);
				//click(fld_fname);
				sendKeysToWebElement(fld_fname, "Lenovo");
				click(fld_lname);
				sendKeysToWebElement(fld_lname, "Test");
				click(fld_comments);
				sendKeysToWebElement(fld_comments, "dsdsdsdsds");
				click(btn_submit);
			}
			
			
			
		}
			
		
	}
	
	
	
}
