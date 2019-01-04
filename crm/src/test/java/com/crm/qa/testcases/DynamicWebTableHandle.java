package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	int row=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
	System.out.println("no of rows "+row);
	int header=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th")).size();
	System.out.println("no of headers "+header);
	int statusCount=0;
	for(int i=1;i<row;i++) {
		for(int j=1;j<header;j++) {
		String status=driver.findElement(By.xpath("//*[@class='table hover']/tbody/tr["+i+"]/td[5]")).getText();
		if(status.equals("Enabled")) {
			System.out.println(status);
			statusCount=statusCount+1;
		}
	}
	System.out.println(statusCount);
	}
	}
}

//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
//*[@id="customers"]/tbody/tr[4]/td[1]
//driver.get("https://www.w3schools.com/html/html_tables.asp");
