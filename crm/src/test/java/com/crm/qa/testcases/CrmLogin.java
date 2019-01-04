package com.crm.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CrmLogin {

	public static void main(String[] args) throws AWTException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	
		
		File file = new File("C:\\Users\\Santosh Molkire\\Desktop\\HalfEbayTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("RegTestData");
		Iterator<Row> rows = sheet.rowIterator();
		rows.next();
		while(rows.hasNext()){
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			while(cells.hasNext()){
				Cell cell = cells.next();
				if(cell.getCellType()==0){
					//System.out.println((int)cell.getNumericCellValue());
				}else{
					System.out.println(" -- "+cell.getStringCellValue());
				}
			}
			/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	  // Maximize the window
	  driver.manage().window().maximize();

	  // Open facebook
	  driver.get("http://www.facebook.com");

	  driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");

	  // Enter password
	  driver.findElement(By.id("pass")).sendKeys("mukesh");

	  Robot robot=new Robot();

	  robot.keyPress(KeyEvent.VK_ENTER);

	  robot.keyRelease(KeyEvent.VK_ENTER);

	  Actions action=new Actions(driver);

			 */

		}
	}	
}
