package com.stepDefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FindBrokenLink {

	WebDriver driver;
	
	@BeforeSuite
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 System.out.println("---------******-----");
	}
	
	
	
	@Test
	public void findAllLinks() throws MalformedURLException, IOException
	{
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println("# Links: " + allLinks.size());
		int i=1;
		
		for(WebElement link: allLinks)
		{
			String url = link.getAttribute("href");
			
			if(url!=null && !url.contains("javascript"))
			{
				HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
				connection.connect();
				
				int responseCode =connection.getResponseCode();
				String responseMessage = connection.getResponseMessage();
				System.out.println(i + ". " + url + "\n \t " + responseCode + "\n \t "+ responseMessage);
				i++;
				connection.disconnect();
			}
			
			
		}
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
