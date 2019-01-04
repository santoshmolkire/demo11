package com.crm.qa.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Appconstant;
import com.crm.qa.base.Appconstant.Browsernames;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.CrmLoginPage;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.utility.Apputil;

public class LoginTest  {
	WebDriver driver;
	//public static void main(String[] args) throws InterruptedException {
	@BeforeMethod
	public void login() throws InterruptedException {
		System.out.println("hiii");
		 driver = Apputil.browsers(Browsernames.Chrome,Appconstant.FREE_CRM_APP_URL);
		CrmLoginPage page=PageFactory.initElements(driver, CrmLoginPage.class);
		System.out.println(driver.getTitle());
		page.enterUserName("santoshm");
		page.enterPassword("santosh@123");
		page.login();
		
	}
	@Test
	public void clickoncontactpage() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		DashboardPage dashbordpg=PageFactory.initElements(driver, DashboardPage.class);
		dashbordpg.clickOnNewContactLink();
	}
	
	
	@AfterMethod
	public void closebrowser() {
	driver.quit();
	}	 
		 
	}

