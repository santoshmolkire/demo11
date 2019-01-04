package com.crm.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import com.crm.qa.base.Appconstant.Browsernames;

public class Apputil {
	public static WebDriver driver = null;
	public static WebDriver browsers(Browsernames bname,String url) {
		switch(bname) {
		case Firefox:
			System.setProperty("webdriver.gecko.driver", "E:\\MySofts\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
	case Chrome:
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
	case IE:
			driver = new InternetExplorerDriver();
			break;
	case Safari:
			driver = new SafariDriver();
			break;
	default :
		System.out.println("Khaddyat ja....!");
		
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

		}

	public static WebDriver getwebdriver(){
		if(driver==null)
				Assert.fail("Driver is not initilized..initilize first..then get it...!");
		return driver;
	}


}
