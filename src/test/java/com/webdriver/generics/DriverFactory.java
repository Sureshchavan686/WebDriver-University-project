package com.webdriver.generics;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.AmazonExamples;
import com.pages.LoginPage;
import com.pages.WebUniversityPages;

public class DriverFactory {
	
	public static AmazonExamples amz;
	public static WebUniversityPages wb;
	public static LoginPage lp;
	public static WebDriver driver;

	public WebDriver getDriver() {
		try {

			FileReader rdr = new FileReader("./data.properties");
			Properties pr = new Properties();
			pr.load(rdr);

			pr.getProperty("url");
			String browserName = pr.getProperty("browserName");
			driver = null;

			switch (browserName) {
			case "firefox":
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();

				}
				break;

			case "chrome":
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "edge":
				if (driver == null) {
					System.setProperty("webdriver.edge.driver", "./edgedriver.exe");
					driver = new EdgeDriver();
					driver.manage().window().maximize();
				}
				break;

			}

		} catch (Exception e) {
			System.out.println("Unable to load driver: " + e);
		}
		
		finally
		{
			amz = PageFactory.initElements(driver, AmazonExamples.class);
			wb = PageFactory.initElements(driver, WebUniversityPages.class);
			lp = PageFactory.initElements(driver, LoginPage.class);
			
		}

		return driver;

	}

}
