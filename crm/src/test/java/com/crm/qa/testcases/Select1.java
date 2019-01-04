package com.crm.qa.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;

public class Select1 implements TargetLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.close();
		driver.findElement(By.xpath("")).click();
		Actions action = new Actions(driver);
		action.
		
		

	}

	@Override
	public WebDriver frame(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(String nameOrId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver frame(WebElement frameElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver parentFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver window(String nameOrHandle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebDriver defaultContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement activeElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alert alert() {
		// TODO Auto-generated method stub
		return null;
	}

}
