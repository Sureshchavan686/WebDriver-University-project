package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.generics.BaseLibrary;

public class LoginPage extends BaseLibrary {

	@FindBy(xpath = "//h1[contains(text(),'LOGIN PORTAL')]")
	public static WebElement btn_LoginPortal;

	@FindBy(xpath = "//input[@placeholder='Username' and @id='text']")
	public static WebElement fld_username;

	@FindBy(xpath = "//input[@placeholder='Password' and @id='password']")
	public static WebElement fld_password;

	@FindBy(xpath = "//button[@type='submit' and @id='login-button']")
	public static WebElement btn_submit;

	public void swithcToChildTab() {
		waitTill("2");
		String parwin = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!(parwin.equals(child))) {
				driver.switchTo().window(child);
			}
		}
	}

	public void clickOnLogin() {
		click(btn_LoginPortal);
	}

	public void enterUserName(String username) {
		sendKeysToWebElement(fld_username, username);
	}

	public void enterPassword(String password) {
		sendKeysToWebElement(fld_password, password);
	}

	public void clickOnSubmit() {
		click(btn_submit);
		driver.switchTo().alert().accept();
	}

}
