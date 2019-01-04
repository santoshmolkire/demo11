package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmLoginPage {
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;

	WebDriver browser = null;
	public void enterUserName(String name){
		username.clear();
		username.sendKeys(name);
	}

	public void enterPassword(String pwd){
	password.clear();
	password.sendKeys(pwd);
	}

	public  DashboardPage login(){
		loginbtn.click();
		return new DashboardPage();
		
	}
}
