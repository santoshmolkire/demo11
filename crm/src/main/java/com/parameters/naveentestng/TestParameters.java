package com.parameters.naveentestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestParameters {
	WebDriver driver;
	@Test
	public void crmLoginTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("santoshm");
		driver.findElement(By.name("password")).sendKeys("santosh@123");
	}
}
