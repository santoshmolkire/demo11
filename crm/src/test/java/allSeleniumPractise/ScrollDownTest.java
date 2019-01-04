package allSeleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScrollDownTest {
	
	@Test
	public void scrollDown() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//1.scroll down page 
		 //js.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);

		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);

		Files.copy(srcFile, new File("D:\\\\selenium folder\\\\crm\\\\screenShot\\\\crm.png"));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
	}
	
	
	
}
