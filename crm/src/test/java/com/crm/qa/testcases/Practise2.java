package com.crm.qa.testcases;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Practise2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/index.html");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D:\\selenium folder\\crm\\screenShot\\crm.png"));
		/*File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(screenshotFile, new File("D:\\selenium folder\\crm\\screenShot\\crm.png"));*/
		

	}

}
